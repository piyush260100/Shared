package com.example.shared

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedpreferences = this.getSharedPreferences("com.example.shared", Context.MODE_PRIVATE)

        val friends= ArrayList<String>()
        friends.add("Aniket Saha")
        friends.add("Raghav Gupta")
        friends.add("Ishit Aggarwal")
        friends.add("Vikrant Tyagi")

        try
        {
            sharedpreferences.edit().putString("Friends", ObjectSerializer.serialize(friends)).apply()
            Log.i("Freinds",ObjectSerializer.serialize(friends))
        }catch (e:Exception)
        {
            e.printStackTrace()
        }

        val Newfriends=ArrayList<String>()
      //  Newfriends=ObjectSerializer.deserialize(sharedpreferences.getString("Old Friends",))








        //putting info into the shared preferences
        //sharedpreferences.edit().putString("Username","Nidhi").apply()

        //getting info from shared preferences
        //val username:String?=sharedpreferences.getString("Username","-1")

        //Log.i("user:",username.toString() )

    }
}