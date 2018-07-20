#!/bin/bash

set -e -u -x

cd source-code/
./mvnw package
cp target/concourse-spring-boot-maven-0.0.1-SNAPSHOT.jar ../target

