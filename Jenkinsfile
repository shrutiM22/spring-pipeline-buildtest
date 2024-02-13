pipeline {
    agent any
    tools{
        maven '3.9.4'
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
       stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/shrutiM22/spring-pipeline-buildtest.git']])                
                sh 'mvn clean install'
            }
        }
        stage('test') {
            steps {
                echo 'tested'
            }
        }
    }
}
