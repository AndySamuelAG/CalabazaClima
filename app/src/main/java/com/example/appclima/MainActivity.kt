package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvClima:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvClima = findViewById(R.id.tvClima)

        val ciudad = intent.getStringExtra("com.example.appclima.ciudades.CIUDAD")

        Toast.makeText(this, ciudad, Toast.LENGTH_SHORT).show()

        val ciudadAqp = Ciudad("Ciudad: Arequipa", 22, "Frio")
        val ciudadCcs = Ciudad("Ciudad: Caracas", 30, "Soleado")

        if(ciudad == "arequipa"){
            tvCiudad?.text = ciudadAqp.nombre
            tvGrados?.text = ciudadAqp.grados.toString() + "º"
            tvClima?.text = ciudadAqp.clima
        }else if(ciudad == "caracas"){
            tvCiudad?.text = ciudadCcs.nombre
            tvGrados?.text = ciudadCcs.grados.toString() + "º"
            tvClima?.text = ciudadCcs.clima
        }else{
            Toast.makeText(this, "No se encontró la ciudad", Toast.LENGTH_SHORT).show()
        }
    }
}
