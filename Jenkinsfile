pipeline {
  agent {
    node {
      label 'windows'
    }

  }
  stages {
    stage('Control POM') {
      parallel {
        stage('Control POM') {
          agent {
            node {
              label 'windows'
            }

          }
          steps {
            fileExists 'pom.xml'
          }
        }

        stage('Control to Versions') {
          agent {
            node {
              label 'windows'
            }

          }
          steps {
            bat 'java --version'
            bat 'git --version'
          }
        }

      }
    }

  }
}