package com.mcet.campus_connect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class ChatActivity : AppCompatActivity() {

    private lateinit var  chatRecyclerView: RecyclerView
    private lateinit var messageBox: EditText
    private lateinit var sendButton: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val intent =Intent()
        val name =intent.getStringExtra("name")
        val uid = intent.getStringExtra("uid")


        supportActionBar?.title =name
        chatRecyclerView = findViewById(R.id.chatRecyclerView)
        messageBox= findViewById(R.id.messageBox)
        sendButton = findViewById(R.id.sentButton)
    }
}