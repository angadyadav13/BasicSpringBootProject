pipeline {  
    agent any
    
    options {
        skipStagesAfterUnstable()
    }
    
    tools {
    maven 'EngineeringCorner_Maven'
   }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
