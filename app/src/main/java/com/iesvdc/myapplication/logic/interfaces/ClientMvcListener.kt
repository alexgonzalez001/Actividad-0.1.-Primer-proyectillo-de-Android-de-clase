package com.iesvdc.myapplication.logic.interfaces

interface ClientMvcListener {
    fun MvcAddClient(id: Int, name: String)
    fun MvcUpdateClient(id: Int, name: String)
    fun MvcDeleteClient(id: Int)
}