package com.example.day22project2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listview2_advanced.R
import com.example.listview2_advanced.User

class MyAdapter (private val context : Activity, private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context, R.layout.eachitem, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        The LayoutInflater is used to convert your XML layout file (eachitem.xml)
//        into a View object that can be returned and shown in the ListView.

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.eachitem, null)

        val image = view.findViewById<ImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.tVName)
        val lastMsg = view.findViewById<TextView>(R.id.tVLastMessage)
        val lastMsgTime = view.findViewById<TextView>(R.id.tVLastMsgTime)

        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMsg
        lastMsgTime.text = arrayList[position].lastMsgTime
        image.setImageResource(arrayList[position].imageId)

        return view
    }
}