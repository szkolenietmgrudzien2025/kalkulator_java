pipeline {
    agent any
    tools {
        maven 'maven_3.9'
    }
    stages {
        stage("pull") {
            steps {
                git url: 'https://github.com/szkolenietmgrudzien2025/kalkulator_java.git', branch: 'master'
            }
        }
        stage("build") {
            steps {
                // bat 'mvn clean package'
                sh 'mvn clean package'
            }
        }
    }
    post {
        success {
            archiveArtifacts 'target/*.jar'
        }
    }
}

