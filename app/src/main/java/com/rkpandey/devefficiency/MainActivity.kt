package com.rkpandey.devefficiency

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var etDessertInput: EditText
    private lateinit var tvDesserts: TextView
    private lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etDessertInput = findViewById(R.id.etDessertInput)
        tvDesserts = findViewById(R.id.tvDesserts)
        btnSubmit = findViewById(R.id.btnSubmit)

        val dessert = etDessertInput.text.toString()
        btnSubmit.setOnClickListener {
            Log.i(TAG, "onClick")
            val currentDesserts = tvDesserts.text.toString()
            if (currentDesserts.isEmpty()) {
                Log.i(TAG, "currentDesserts is empty")
                tvDesserts.setText(dessert)
            } else {
                Log.i(TAG, "There is content in the text view")
                tvDesserts.setText(currentDesserts + ", " + dessert)
            }
            etDessertInput.setText("")
        }
    }
}
