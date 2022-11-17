package com.example.recycapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recycler : RecyclerView = findViewById(R.id.recycuser)

        val user1 = names("kemunto", "mary", "mami")
        val user2 = names("njuguna", "wilson", "willy")
        val user3 = names("chemutai", "naory", "nano")

        val usersList = ArrayList<names>()
        usersList.add(user1)
        usersList.add(user2)
        usersList.add(user3)



        var adapter = customadapter(usersList)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
    }
}