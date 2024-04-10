package com.estudo.clinica_veterinaria.pet.domain.request

import com.estudo.clinica_veterinaria.cliente.domain.request.Cliente
import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.*


@Entity
@Table(name = "pets")
class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null;
    var nome: String? = null;
    var genero: String? = null;
    var idade: String? = null;
    var raca: String? = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_dono_id")
    var dono: Cliente? = null;
}