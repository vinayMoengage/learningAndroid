package com.example.learningandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.moe.pushlibrary.MoEHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){

        val button1 = findViewById<AppCompatButton>(R.id.track_user_attributes)
        button1.setOnClickListener{
            MoEHelper.getInstance(this@MainActivity).setUniqueId("test_user_1")
        }

        val button2 = findViewById<AppCompatButton>(R.id.track_user_details)
        button2.setOnClickListener{
            MoEHelper.getInstance(this@MainActivity).setFirstName("Vinay")
            MoEHelper.getInstance(this@MainActivity).setLastName("Kumar")
            MoEHelper.getInstance(this@MainActivity).setEmail("vinay.kumar@moengage.com")
        }

        val button3 = findViewById<AppCompatButton>(R.id.track_custom_attributes)
        button3.setOnClickListener{
            MoEHelper.getInstance(this@MainActivity).setUserAttribute("custom_attr_1","value_1")
        }

        val button4 = findViewById<AppCompatButton>(R.id.logout)
        button4.setOnClickListener{
            MoEHelper.getInstance(this).logoutUser()
        }

    }
}