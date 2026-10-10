package com.iesvdc.myapplication.logic.interfaces

interface ClientCrudListener {
    fun ClientAdd(id: Int, name: String)
    fun ClientDel(id: Int)
    fun ClientUpdate(id: Int, name: String)
}