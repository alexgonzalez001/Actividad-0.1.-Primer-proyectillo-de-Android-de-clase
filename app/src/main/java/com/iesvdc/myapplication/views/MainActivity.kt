package com.iesvdc.myapplication.views

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.iesvdc.myapplication.R
import com.iesvdc.myapplication.logic.ClientController

class MainActivity : AppCompatActivity() {

    private lateinit var controller: ClientController
    private lateinit var dialog: ClientDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog = ClientDialog()
        controller = ClientController(this, dialog)

        val btnInsert = findViewById<Button>(R.id.btnInsert)
        val btnUpdate = findViewById<Button>(R.id.btnUpdate)
        val btnDelete = findViewById<Button>(R.id.btnDelete)

        controller.initListeners(btnInsert, btnUpdate, btnDelete)
    }
}