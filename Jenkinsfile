// Configuración requerida en Jenkins:
// - Maven: Administrar Jenkins → Herramientas → Maven installations
// - JDK: En la misma ruta, definir JDK11

pipeline {
    agent any
    
    tools {
        maven 'Maven 3.9.10'
        jdk 'JDK11'
    }
    
    stages {
        stage('Clonar') {
            steps {
                git 'https://github.com/FranciscoLeivaN/saludoapp.git'
            }
        }
        
        stage('Compilar') {
            steps {
                bat 'mvn clean compile'
            }
        }
        
        stage('Probar') {
            steps {
                bat 'mvn test'
            }
        }
        
        stage('Empaquetar') {
            steps {
                bat 'mvn package'
            }
        }
    }
    
    post {
        success {
            echo "✅ El build fue exitoso"
        }
        
        failure {
            echo "❌ El build falló"
        }
    }
}