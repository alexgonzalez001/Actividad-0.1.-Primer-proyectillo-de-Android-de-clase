package com.iesvdc.myapplication.views

import android.util.Log
import com.iesvdc.myapplication.logic.ClientController

class ClientDialogFragment {

    companion object {
        const val TAG = "---SALIDA---"
    }

    private val controller = ClientController()

    fun show(
        option: Int,
        onAdd: (Int, String) -> Unit,
        onUpdate: (Int, String) -> Unit,
        onDelete: (Int) -> Unit
    ) {
        when (option) {
            0 -> {
                val id = (100..999).random()
                Log.d(TAG, "Diálogo: simulando inserción...")
                onAdd(id, "Cliente_$id")
            }
            1 -> {
                val id = 100 // ID de ejemplo a modificar
                Log.d(TAG, "Diálogo: simulando actualización...")
                onUpdate(id, "ClienteModificado")
            }
            2 -> {
                val id = 100 // ID de ejemplo a borrar
                Log.d(TAG, "Diálogo: simulando eliminación...")
                onDelete(id)
            }
        }
    }
}