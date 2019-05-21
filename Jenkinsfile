node{
   stage('SCM Checkout'){
     git 'https://github.com/chandranitu/docker-microservice'
   }
   stage('Compile-Package'){    
      def mvnHome =  tool name: 'maven3.6', type: 'maven'
	  
      //sh "${mvnHome}/bin/mvn package"
	  "${mvnHome}/bin/mvn package"
   }
   /*
   stage('Email Notification'){
      mail bcc: '', body: '''Hi Welcome to jenkins email alerts
      Thanks
      Chandra''', cc: '', from: '', replyTo: '', subject: 'Jenkins Job', to: 'cnsnoida@gmail.com'
   }
   stage('Slack Notification'){
       slackSend baseUrl: 'https://hooks.slack.com/services/',
       channel: '#jenkins-pipeline-demo',
       color: 'good', 
       message: 'Welcome to Jenkins, Slack!', 
       teamDomain: 'javahomecloud',
       tokenCredentialId: 'slack-demo'
   }*/
}