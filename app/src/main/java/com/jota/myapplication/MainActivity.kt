package com.jota.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var btnAccion : Button
    private lateinit var txtCampo1 : EditText
    private lateinit var txtCampo2 : EditText
    private lateinit var lblResultado : TextView
    private lateinit var lista : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAccion = findViewById(R.id.btnAccion)
        txtCampo1 = findViewById(R.id.txtCampo1)
        txtCampo2 =findViewById(R.id.txtCampo2)
        lblResultado = findViewById(R.id.lblResultado)
        lista = findViewById(R.id.lista)

        val colores = arrayOf("Verde, Amarillo, Rojo")
        val valores = arrayOf(1,2,3)
        val adaptador = ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, colores)
        lista.adapter = adaptador

        btnAccion.setOnClickListener {
            //lblResultado.text = btnAccion.text.toString().toInt().toString()
            val activity2 = Intent (this, MainActivity2 :: class.java)
            startActivity (activity2)
        }

        lista.setOnItemClickListener {
            adapterView, view, i, l -> lblResultado.text = valores[i].toString()
        }


    }
}