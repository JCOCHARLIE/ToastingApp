package com.example.toasting_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var display_text:TextView
    private lateinit var edt_text:EditText
    private lateinit var submit_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text = findViewById(R.id.txtdisplay)
        edt_text = findViewById(R.id.edtname)
        submit_button = findViewById(R.id.btnbutton)

        submit_button.setOnClickListener{
            //Toast.makeText(this, "LA", Toast.LENGTH_SHORT).show()
            var user_data = edt_text.text.toString().trim()
            //Toast.makeText(this, user_data,Toast.LENGTH_SHORT).show()
            display_text.text = user_data.toString()
        }
    }
}