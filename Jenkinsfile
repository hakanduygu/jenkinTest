pipeline {
  agent {
    node {
      label 'iQuality'
    }

  }
  stages {
    stage('Control POM') {
      steps {
        fileExists 'pom.xml'
      }
    }

  }
}