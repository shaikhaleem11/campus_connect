package com.mcet.campus_connect

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        // Add any initialization code or delay if needed before transitioning to the login activity
        // For example, you might want to perform some setup or load resources here

        // Using a Handler associated with the MainLooper to delay the transition to LoginActivity for 2 seconds (2000 milliseconds)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish() // Close the splash activity so that it's not in the back stack
        }, 2000)
    }
}
