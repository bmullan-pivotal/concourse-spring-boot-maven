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
    
    stage('Deploy') {
        pushToCloudFoundry(
          target: 'api.run.pivotal.io',
          organization: 'CVSWksp',
          cloudSpace: 'BarryM',
          credentialsId: 'pcf_user',
          selfSigned: true,
          servicesToCreate: [
            []
          ],
          manifestChoice: [
            value: 'jenkinsConfig',
            appName: 'springboot-jenkins-example',
            memory: 1024,
            instances: 1,
            services: [],
            envVars: [
          []
        ],
        appPath: 'target/concourse-spring-boot-maven-0.0.1-SNAPSHOT.jar'
      ]
    )    
    }

    
    }
}
