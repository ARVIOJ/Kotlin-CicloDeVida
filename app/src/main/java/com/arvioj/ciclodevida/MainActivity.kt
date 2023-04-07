package com.arvioj.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Actividad1", "Ejecutando onCreate()")
        val botonSiguiente = findViewById<Button>(R.id.button)
        val botonSalir = findViewById<Button>(R.id.button2)
        botonSalir.setOnClickListener{
            Log.d("Actividad1", "Presiono el boton salir")
            finish()
        }
        botonSiguiente.setOnClickListener{
            Log.d("Actividad22", "Presiono el boton siguiente")
            val myIntent = Intent(this, Activity2::class.java)
            startActivity(myIntent)
            finish()
            
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Actividad1", "Ejecutando onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Actividad1", "Ejecutando onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Actividad1", "Ejecutando onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Actividad1", "Ejecutando onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Actividad1", "Ejecutando onDestroy()")
    }
}