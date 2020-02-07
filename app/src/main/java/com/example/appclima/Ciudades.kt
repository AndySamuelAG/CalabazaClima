package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bAqp = findViewById<Button>(R.id.bAqp)
        val bCcs = findViewById<Button>(R.id.bCcs)

        bAqp.setOnClickListener(View.OnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "arequipa")
            startActivity(intent)
        })
        bCcs.setOnClickListener(View.OnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "caracas")
            startActivity(intent)
        })
    }
}
