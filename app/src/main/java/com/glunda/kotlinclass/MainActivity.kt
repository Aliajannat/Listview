package com.glunda.kotlinclass

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.lisview);
        var myarray = ArrayList<String>()
        myarray.add("Jannat")
        myarray.add("Naima")
        myarray.add("Nahar")
        myarray.add("Jannat")
        myarray.add("Naima")
        myarray.add("Nahar")


        var myadapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,myarray)
        listview.adapter = myadapter

    }
}


