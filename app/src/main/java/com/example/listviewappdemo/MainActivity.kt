package com.example.listviewappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.MyListView)
        var taskList = arrayListOf<String>()
        taskList.add("complete listview app code")
        taskList.add("Have lunch")
        taskList.add("check demat ac")
        taskList.add("buy running shoes to kshitu")

        val adaptterForMyListview = ArrayAdapter(this,android.R.layout.simple_list_item_1, taskList)
        listView.adapter = adaptterForMyListview

        listView.setOnItemClickListener{ parent, view, position,id->

            val text = "Clicked on item :" + (view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }


        }
}