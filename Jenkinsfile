pipeline {
  agent {
    node {
      label 'iQuality'
    }

  }
  stages {
    stage('error') {
      parallel {
        stage('gggg') {
          steps {
            fileExists 'pom.xml'
          }
        }

        stage('qweqwe') {
          steps {
            bat(script: 'git --version', label: 'iQuality', returnStatus: true, encoding: '.', returnStdout: true)
            bat(script: 'java --version', label: 'iQuality', returnStatus: true, returnStdout: true, encoding: '.')
          }
        }

      }
    }

  }
}