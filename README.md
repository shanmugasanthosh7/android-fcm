# android-fcm
Firebase Cloud Messaging 17.1.0 new update

Replace **google-services.json** with your own json. 

Firebase Cloud Messaging deprecated the **FirebaseInstanceIdService**, So we can access token by extending **FirebaseMessagingService** and overriding method *onNewToken(token: String?)*.

## How to get token?

```kotlin 
FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener {
            // Send token to your server
            it.token
        }
```

## To Prevent Instance Id autogeneration. Follow below methods,

###### Method 1 - XML

```xml
<application>
  <meta-data android:name="firebase_messaging_auto_init_enabled"
             android:value="false" />
  <meta-data android:name="firebase_analytics_collection_enabled"
             android:value="false" />
</application>
```
*Note: You must disable both FCM and Analytics.*

###### Method 2 - Activity or Application

FirebaseMessaging.getInstance().isAutoInitEnabled = true