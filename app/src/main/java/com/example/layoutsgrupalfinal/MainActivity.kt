package com.example.layoutsgrupalfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnNavegar1: Button
    private lateinit var btnNavegar2: Button
    private lateinit var btnNavegar3: Button
    private lateinit var btnNavegar4: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNavegar1 = findViewById(R.id.Boton1)
        btnNavegar2 = findViewById(R.id.Boton2)
        btnNavegar3 = findViewById(R.id.Boton3)
        btnNavegar4 = findViewById(R.id.Boton4)

        //val intent = Intent(this@MainActivity, Pantalla03::class.java)


        btnNavegar1.setOnClickListener(){
            val intent = Intent(this@MainActivity, Pantalla01::class.java)
            startActivity(intent)
        }
        btnNavegar2.setOnClickListener(){
            val intent = Intent(this@MainActivity, Pantalla02::class.java)
            startActivity(intent)
        }

        btnNavegar3.setOnClickListener(){
            val intent = Intent(this@MainActivity, Pantalla03::class.java)
            startActivity(intent)
        }
        btnNavegar4.setOnClickListener(){
            val intent = Intent(this@MainActivity, Pantalla04::class.java)
            startActivity(intent)
        }



    }


//Boton que cambie de pantalla
}
//Hola mundo