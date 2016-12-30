node {
   stage('Preparation') {
      git 'https://github.com/ivanmoore/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}