package com.example.practicando

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var aleatorio:Int = (1..100).random()
        var boton = findViewById<Button>(R.id.boton)
        var introducirNumero = findViewById<EditText>(R.id.editText)
        var contador: Int = 0
        
        boton.setOnClickListener{
            var userNumero: Int = Integer.parseInt(introducirNumero.text.toString())
            if ( userNumero == aleatorio){
                println("Acerto, fueron necesarios estos intentos: "+contador)
                Snackbar.make(it, "Has acertado", Snackbar.LENGTH_SHORT).show()
            }else{
                contador = contador + 1
                if(userNumero < aleatorio){
                    println("ES MENOR")
                }else{
                    println("ES MAYOR")
                }
            }
        }
    }

}