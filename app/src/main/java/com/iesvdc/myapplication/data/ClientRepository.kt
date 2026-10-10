package com.iesvdc.myapplication.data

object ClientRepository {
    val clients : MutableList<Client> = mutableListOf(
        Client(1, "David"),
        Client(2, "Alejandro"),
        Client(3, "Hugo"),
        Client(4, "Eduardo"),
        Client(5, "Felix")
    )
}