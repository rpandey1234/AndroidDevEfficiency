package com.rkpandey.devefficiency

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "LoginActivity"
class LoginActivity : AppCompatActivity() {
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etUsername = findViewById(R.id.username)
        etPassword = findViewById(R.id.password)
        btnLogin = findViewById(R.id.login)

        btnLogin.setOnClickListener {
            //if (etPassword.text.toString() == "MyTestPassword") {
                Log.i(TAG, "correct password")
                val mainIntent = Intent(this, MainActivity::class.java)
                this.startActivity(mainIntent)
            // }
        }
    }
}