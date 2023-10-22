package com.mcet.campus_connect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    private lateinit var edt_Email: EditText
    private lateinit var edt_password: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt_Email = findViewById(R.id.edt_email)
        edt_password = findViewById(R.id.edt_password)
        btnLogin = findViewById(R.id.btnLogin)
        btnSignUp = findViewById(R.id.btnSignup)


        btnSignUp.setOnClickListener{
            val intent= Intent(this, SignUp::class.java)
            startActivity(intent)
        }

    }
}