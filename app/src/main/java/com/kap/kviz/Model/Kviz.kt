package com.kap.kviz.Model

class Kviz {
    //Pitanja
    private var prvoPitanje: Pitanje =
        Pitanje("Pariz je glavni grad Njemacke", false)
    private var drugoPitanje: Pitanje =
        Pitanje("Sarajevo je glavni grad Spanije", false)
    private var trecePitanje: Pitanje =
        Pitanje("London je glavni grad Engleske", true)
    private var cetvrtoPitanje: Pitanje =
        Pitanje("Zagreb je glavni grad Hrvatske", true)
    private var petoPitanje: Pitanje =
        Pitanje("Tokio je glavni grad Japana", true)


    var pitanja: List<Pitanje> = listOf(prvoPitanje, drugoPitanje, trecePitanje, cetvrtoPitanje, petoPitanje)
}