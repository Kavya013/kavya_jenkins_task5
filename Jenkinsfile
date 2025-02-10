pipeline {
    agent any
    
    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/Kavya013/kavya_jenkins_task5'
            }
        }

        stage('Compile Java Code') {
            steps {
                script {
                    echo 'Compiling Java program...'
                    sh 'javac TimestampPrinter.java'
                }
            }
        }

        stage('Run Java Program') {
            steps {
                script {
                    echo 'Executing Java program...'
                    sh 'java TimestampPrinter'
                }
            }
        }
    }

    post {
        always {
            echo 'Build completed!'
        }
    }
}
