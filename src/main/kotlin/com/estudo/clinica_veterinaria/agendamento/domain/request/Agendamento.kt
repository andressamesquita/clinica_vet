package com.estudo.clinica_veterinaria.agendamento.domain.request

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null;
    var data: String? = null;
    var hora: String? = null;
    var cliente: String? = null;
    var pet: String? = null

}
