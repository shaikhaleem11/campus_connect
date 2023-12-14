package com.mcet.campus_connect

// MyFirebaseMessagingService.kt
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Handle the received message and show a notification
        if (remoteMessage.notification != null) {
            val title = remoteMessage.notification!!.title
            val body = remoteMessage.notification!!.body

            showNotification(title, body)
        }
    }

    private fun showNotification(title: String?, body: String?) {
        // Create a notification
        val notificationManager =
            getSystemService(NotificationManager::class.java)
        val channelId = "default_channel"

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "Default Channel",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
        }

        val builder = NotificationCompat.Builder(this, channelId)
            .setContentTitle(title)
            .setContentText(body)
            .setSmallIcon(R.drawable.ic_notification_icon)
            .setAutoCancel(true)

        val notification: Notification = builder.build()
        notificationManager.notify(0, notification)
    }
}
