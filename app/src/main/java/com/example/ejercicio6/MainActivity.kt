package com.example.ejercicio6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "Apartado 1"

class MainActivity : AppCompatActivity() {
    var hola : String = "hola"
    var ente = 20;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //onStart()
        println("acascoc098 Andrea Castilla Cocera")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Se llama después de onCreate. Muestro la pantalla. El usuario aún no puede interaccionar")
        hola += " acascoc098"
        ente -= 1;
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "El usuario ya puede interaccionar con la pantalla")
        hola += " jj"
        ente += 1;
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Adiós a la pantalla, boton home para seguir")
        hola = "En pausa"
        ente = 1;
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Vuelvo a estar visible.")
        hola += "Reiniciamos"
        ente -= 3;
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "No visible para el usuario. Otra App, S.O.")
        hola = "PARA"
        ente = 19;
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "C´est fini.")
        hola += " acascoc098 fuera"
        ente += 1;
        println("Valor de hola: $hola; valor de ente: $ente")
    }

}