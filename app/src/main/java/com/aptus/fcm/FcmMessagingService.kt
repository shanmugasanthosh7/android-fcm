package com.aptus.fcm

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FcmMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        // This method receives Notification and Data Payload
        onMessageReceive()
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)

        sendTokenToRegisterOnServer(token)
    }


    private fun sendTokenToRegisterOnServer(token: String) {
        // Handle your logic
    }

    private fun onMessageReceive() {

    }
}