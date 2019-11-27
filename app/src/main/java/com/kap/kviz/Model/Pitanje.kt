package com.kap.kviz.Model

data class Pitanje(var textPitanja: String,
                   var daLiJeTacno: Boolean,
                   var daLiJeOdgovoreno: Boolean = false)