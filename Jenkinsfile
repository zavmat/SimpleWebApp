node {
   stage('Preparation') {
      git 'https://github.com/zavmat/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}