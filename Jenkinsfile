pipeline { 
    agent any 

    environment { 
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-17"  
        PATH = "${JAVA_HOME}\\bin;C:\\Windows\\System32;C:\\Windows"  
    } 

    stages { 
        stage('Initialize') { 
            steps { 
                script {
                    echo "Initializing Pipeline..."
                    bat 'java -version'  
                }
            }
        }

        stage('Compile Java Code') { 
            steps { 
                script {
                    echo "Compiling Java program..."
                    bat 'javac TimestampPrinter.java'  
                }
            }
        }

        stage('Run Java Program') { 
            steps { 
                script {
                    echo "Running Java program..."
                    bat 'java TimestampPrinter'  
                }
            }
        }
    }

    post {
        always {
            echo "Cleaning up workspace..."
        }
    }
}
