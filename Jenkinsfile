pipeline {
    agent any

    environment {
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-17"
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }

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
                    bat '"C:\\Windows\\System32\\cmd.exe" /c javac TimestampPrinter.java'
                }
            }
        }

        stage('Run Java Program') {
            steps {
                script {
                    echo "Running Java program..."
                    bat '"C:\\Windows\\System32\\cmd.exe" /c java TimestampPrinter'
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
