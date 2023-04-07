package com.arvioj.ciclodevida

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        Log.d("Actividad2", "Ejecutando onCreate()")
        val botonRegresar = findViewById<Button>(R.id.button3)
        val botonSalir = findViewById<Button>(R.id.button4)
        botonSalir.setOnClickListener{
            Log.d("Actividad2", "Presiono el boton salir")
            finish()
        }
        botonRegresar.setOnClickListener{
            Log.d("Actividad2", "Presiono el boton regresar")
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Actividad2", "Ejecutando onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Actividad2", "Ejecutando onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Actividad2", "Ejecutando onPause()")
    }


    override fun onStop() {
        super.onStop()
        Log.d("Actividad2", "Ejecutando onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Actividad2", "Ejecutando onDestroy()")
    }
}