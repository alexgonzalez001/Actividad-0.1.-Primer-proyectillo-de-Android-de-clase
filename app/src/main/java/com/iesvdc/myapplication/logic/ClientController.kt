package com.iesvdc.myapplication.logic

import android.util.Log
import com.iesvdc.myapplication.data.Client
import com.iesvdc.myapplication.data.ClientRepository

class ClientController {

    companion object {
        const val TAG = "---SALIDA---"
    }

    fun addClient(id: Int, name: String) {
        val newClient = Client(id, name)
        ClientRepository.clients.add(newClient)
        Log.d(TAG, "Controller: Cliente insertado -> $newClient")
        Log.d(TAG, ClientRepository.clients.toString())
    }

    fun updateClient(id: Int, name: String) {
        val client = ClientRepository.clients.find { it.id == id }
        if (client != null) {
            client.name = name
            Log.d(TAG, "Controller: Cliente actualizado con ID $id")
        } else {
            Log.d(TAG, "Controller: Cliente con ID $id no encontrado para actualizar")
        }
        Log.d(TAG, ClientRepository.clients.toString())
    }

    fun deleteClient(id: Int) {
        val removed = ClientRepository.clients.removeIf { it.id == id }
        if (removed) {
            Log.d(TAG, "Controller: Cliente eliminado con ID $id")
        } else {
            Log.d(TAG, "Controller: Cliente con ID $id no encontrado para eliminar")
        }
        Log.d(TAG, ClientRepository.clients.toString())
    }
}