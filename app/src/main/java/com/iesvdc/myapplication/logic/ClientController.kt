package com.iesvdc.myapplication.logic

import android.util.Log
import android.widget.Button
import com.iesvdc.myapplication.data.Client
import com.iesvdc.myapplication.data.ClientRepository
import com.iesvdc.myapplication.views.ClientDialog
import com.iesvdc.myapplication.views.MainActivity

class ClientController(
    private val activity: MainActivity,
    private val dialog: ClientDialog
) : ClientMvcListener {

    companion object {
        const val TAG = "---SALIDA---"
    }

    init {
        dialog.setListener(this)
    }

    override fun initListeners(
        btnInsert: Button,
        btnUpdate: Button,
        btnDelete: Button
    ) {
        btnInsert.setOnClickListener {
            dialog.show(0)
        }

        btnUpdate.setOnClickListener {
            dialog.show(1)
        }

        btnDelete.setOnClickListener {
            dialog.show(2)
        }
    }

    override fun mvcAddClient(id: Int, name: String) {
        val newClient = Client(id, name)
        ClientRepository.clients.add(newClient)
        Log.d(TAG, "Controller: Cliente insertado -> $newClient")
        updateView()
    }

    override fun mvcUpdateClient(id: Int, name: String) {
        val clientFound = ClientRepository.clients.find { it.id == id }
        if (clientFound != null) {
            clientFound.name = name
            Log.d(TAG, "Controller: Cliente actualizado con ID $id")
        } else {
            Log.d(TAG, "Controller: Cliente con ID $id no encontrado para actualizar")
        }
        updateView()
    }

    override fun mvcDeleteClient(id: Int) {
        val removed = ClientRepository.clients.removeIf { it.id == id }
        if (removed) {
            Log.d(TAG, "Controller: Cliente eliminado con ID $id")
        } else {
            Log.d(TAG, "Controller: Cliente con ID $id no encontrado para eliminar")
        }
        updateView()
    }

    private fun updateView() {
        Log.d(TAG, "Controller: Actualizando vista principal. Lista actual: ${ClientRepository.clients}")
    }
}