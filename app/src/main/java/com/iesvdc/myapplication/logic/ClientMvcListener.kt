package com.iesvdc.myapplication.logic
interface ClientMvcListener {
    fun mvcAddClient(id: Int, name: String)
    fun mvcUpdateClient(id: Int, name: String)
    fun mvcDeleteClient(id: Int)
}