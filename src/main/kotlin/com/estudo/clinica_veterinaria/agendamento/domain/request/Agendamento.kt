package com.estudo.clinica_veterinaria.agendamento.domain.request

import com.estudo.clinica_veterinaria.cliente.domain.request.Cliente
import com.estudo.clinica_veterinaria.pet.domain.request.Pet
import jakarta.persistence.*

@Entity
class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null;
    var data: String? = null;
    var hora: String? = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    var cliente: Cliente? = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id")
    var pet: Pet? = null

}
