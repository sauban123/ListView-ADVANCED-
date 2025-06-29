package com.example.listview2_advanced

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.day22project2.MyAdapter

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // galti ye line add ni thi
        val name = arrayOf("shraddha", "Prastuti", "Ankit", "Pradeep", "Aman" , "sauban", "rahul")

        val lastMsg = arrayOf("Hey everyone", "I am fine", "Good", "Awesome", "cool" , "badmosh", "topa")

        val lastMsgTime = arrayOf("6:25 AM", "7:30 PM", "5:00 PM", "6:25 AM", "7:30 PM",  "6:30 PM", "7:37 PM")

        val phoneNumber = arrayOf("786453739", "986453739", "7366382829", "7383413440", "4159251517","78676545345", "9876543210")

        val imgId = intArrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3,
            R.drawable.img4, R.drawable.img5,R.drawable.img3,R.drawable.img4)

        userArrayList = ArrayList()

        for(eachIndex in name.indices){
            val user = User(name[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex], phoneNumber[eachIndex],
                imgId[eachIndex])

            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)

        listView.setOnItemClickListener { parent, view, position, id ->
            // open a new activity

            val userName = name[position]
            //val userPhone = phoneNumber[position]
            val imageId = imgId[position]
            val lastMsg = lastMsg[position]

            val i = Intent(this, UserActivity::class.java)

            i.putExtra("name", userName)
           // i.putExtra("phone", userPhone)
            i.putExtra("imageId", imageId)
            i.putExtra("lastMsg", lastMsg)
            startActivity(i)
        }
    }
}