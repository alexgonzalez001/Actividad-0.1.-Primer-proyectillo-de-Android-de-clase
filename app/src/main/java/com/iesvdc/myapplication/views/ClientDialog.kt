package com.iesvdc.myapplication.views

import android.util.Log
import com.iesvdc.myapplication.logic.ClientMvcListener

class ClientDialog {

    companion object {
        const val TAG = "---SALIDA---"
    }
    private var listener: ClientMvcListener? = null

    fun setListener(listener: ClientMvcListener) {
        this.listener = listener
    }

    fun show(typeAction: Int) {
        when (typeAction) {
            0 -> {
                val id = (100..999).random()
                Log.d(TAG, "Añadiendo cliente con id: $id")
                listener?.mvcAddClient(id, "Cliente_$id")
            }
            1 -> {
                val id = 100
                Log.d(TAG, "Actualizando cliente con id: $id")
                listener?.mvcUpdateClient(id, "ClienteModificado")
            }
            2 -> {
                val id = 100
                Log.d(TAG, "Eliminando cliente con id: $id")
                listener?.mvcDeleteClient(id)
            }
        }
    }
}