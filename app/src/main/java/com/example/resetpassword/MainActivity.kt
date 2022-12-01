package com.example.resetpassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    private lateinit var number: EditText
    private lateinit var sms: EditText
    private lateinit var password: EditText
    private lateinit var repeatpassword: EditText
    private lateinit var resetbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number = findViewById(R.id.number)
        sms = findViewById(R.id.sms)
        password = findViewById(R.id.password)
        repeatpassword = findViewById(R.id.repeatpassword)
        resetbutton = findViewById(R.id.resetbutton)

        resetbutton.setOnClickListener {
            if (number.text.toString().isDigitsOnly() && number.text.toString()[0].toString() == "5"
                && number.text.toString().length == 9 && sms.text.toString().length == 4 &&
                sms.text.toString()
                    .isDigitsOnly() && password.text.toString() == repeatpassword.text.toString()
                && password.text.toString() != "" && repeatpassword.text.toString() != ""
            ) {
                Toast.makeText(this, "შეამოწმეთ email", Toast.LENGTH_SHORT).show()
            }
        }

    }
}

