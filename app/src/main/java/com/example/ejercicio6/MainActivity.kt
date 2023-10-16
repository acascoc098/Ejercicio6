package com.example.ejercicio6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "Apartado 1"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Se llama después de onCreate. Santi, muestro la pantalla. El usuario aún no puede interaccionar")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "El usuario ya puede interaccionar con la pantalla")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Pierdo el foco de la pantalla. Boton home")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Vuelvo a estar visible para santi.")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Dejo de estar visible para el usuario. Otra App, S.O.")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "La actividad muere.")
    }

}