pipeline { 
    agent any  
    tools { 
        maven 'maven' 
        jdk 'jdk8' 
    }
    stages { 
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }

        stage('Build') { 
            steps { 
               sh 'mvn clean package'
            }
            post {
                success {
                    sh '''
                        echo "PWD = ${PWD}"
                        ls ${PWD}/target
                    '''
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
