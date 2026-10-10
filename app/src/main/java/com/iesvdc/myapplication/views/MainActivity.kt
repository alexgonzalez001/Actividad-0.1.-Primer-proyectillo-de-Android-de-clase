package com.iesvdc.myapplication.views

import android.os.Bundle
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
        controller.start()
    }
}