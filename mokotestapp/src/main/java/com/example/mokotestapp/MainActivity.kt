package com.example.mokotestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mokotest.Greeting
import com.example.mokotest.Resources

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val xxx = Greeting().getMyString().toString(context = this)
        val textView = findViewById<TextView>(R.id.tv_label)
        //textView.text = Greeting().greeting() + " --> " + xxx
        textView.text = Greeting().greeting() + " --> " + Resources.companyName.toString(context = this)
    }
}