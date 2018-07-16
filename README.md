# android-fcm
Firebase Cloud Messaging 17.1.0 new update

Replace **google-services.json** with your own json. 

Firebase Cloud Messaging deprecated **FirebaseInstanceIdService**, So we can refresh token using **FirebaseMessagingService** 
override method *onNewToken(token: String?)*.
