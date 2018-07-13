package com.aptus.fcm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.iid.FirebaseInstanceId

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Get FCM token using Firebase InstanceId
        FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener {
            // FCM token send to to your server
            it.token
        }
    }
}
