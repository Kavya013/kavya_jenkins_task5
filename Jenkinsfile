pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/Kavya013/kavya_jenkins_task5.git'
            }
        }

        stage('Compile Java Code') {
            steps {
                script {
                    echo "Compiling Java program..."
                    bat '"C:\\Program Files\\Java\\jdk-17\\bin\\javac" TimestampPrinter.java'
                }
            }
        }

        stage('Run Java Program') {
            steps {
                script {
                    echo "Running Java program..."
                    bat '"C:\\Program Files\\Java\\jdk-17\\bin\\java" TimestampPrinter'
                }
            }
        }
    }

    post {
        always {
            echo "Build completed!"
        }
    }
}
