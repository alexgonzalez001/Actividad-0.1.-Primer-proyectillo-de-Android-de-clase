package com.iesvdc.myapplication.data

object ClientRepository {
    val clients : MutableList<Client> = mutableListOf(
        Client(100, "David"),
        Client(101, "Alejandro"),
        Client(102, "Hugo"),
        Client(103, "Eduardo"),
        Client(104, "Felix")
    )
}