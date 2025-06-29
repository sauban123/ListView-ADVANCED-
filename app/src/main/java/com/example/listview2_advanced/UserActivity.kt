package com.example.listview2_advanced

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name = intent.getStringExtra("name")
        val message = intent.getStringExtra("lastMsg")
       // val phoneNumber = intent.getStringExtra("phone")
        val imageId = intent.getIntExtra("imageId", R.drawable.img1)

        val nameTv = findViewById<TextView>(R.id.tVName)
        //val phoneTv = findViewById<TextView>(R.id.tVPhone)
        val messageTv = findViewById<TextView>(R.id.tVLastMessage)
        val image = findViewById<ImageView>(R.id.chatProfileImage)

        nameTv.text = name
      //  phoneTv.text = phoneNumber
        messageTv.text = message
        image.setImageResource(imageId)

    }
}