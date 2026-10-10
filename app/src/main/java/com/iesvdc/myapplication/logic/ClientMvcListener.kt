package com.iesvdc.myapplication.logic

import android.widget.Button

interface ClientMvcListener {
    fun mvcAddClient(id: Int, name: String)
    fun mvcUpdateClient(id: Int, name: String)
    fun mvcDeleteClient(id: Int)
    fun initListeners(btnInsert: Button, btnUpdate: Button, btnDelete: Button)
}