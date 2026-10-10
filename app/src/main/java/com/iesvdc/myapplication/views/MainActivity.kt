package com.iesvdc.myapplication.views

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.iesvdc.myapplication.logic.ClientController
import com.iesvdc.myapplication.views.ClientDialogFragment

class MainActivity : ComponentActivity() {
    companion object {
        const val TAG = "---SALIDA---"
    }
    private val controller = ClientController()
    private val dialog = ClientDialogFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "Iniciando MainActivity (Rama Lambda)")

        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
                ) {
                    Button(onClick = {
                        dialog.show(
                            option = 0,
                            onAdd = { id, name -> controller.addClient(id, name) },
                            onUpdate = { _, _ -> },
                            onDelete = {}
                        )
                    }) {
                        Text("Insertar (+)")
                    }

                    Button(onClick = {
                        dialog.show(
                            option = 1,
                            onAdd = { _, _ -> },
                            onUpdate = { id, name -> controller.updateClient(id, name) },
                            onDelete = {}
                        )
                    }) {
                        Text("Actualizar (✎)")
                    }

                    Button(onClick = {
                        dialog.show(
                            option = 2,
                            onAdd = { _, _ -> },
                            onUpdate = { _, _ -> },
                            onDelete = { id -> controller.deleteClient(id) }
                        )
                    }) {
                        Text("Eliminar (X)")
                    }
                }
            }
        }
    }
}