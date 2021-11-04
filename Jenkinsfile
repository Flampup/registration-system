pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                bat './gradlew clean'
            }
        }
        stage('Build') {
            steps {
                bat './gradlew build'
            }
        }
        stage('Test') {
            steps {
                bat './gradlew test'

            }
        }
    }
    post {
        always {
            junit 'build/test-results/test/*.xml'
        }
    }
}