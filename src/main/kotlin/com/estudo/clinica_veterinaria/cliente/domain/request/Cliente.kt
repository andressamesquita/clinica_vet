package com.estudo.clinica_veterinaria.cliente.domain.request

import com.estudo.clinica_veterinaria.pet.domain.request.Pet
import jakarta.persistence.*

@Entity
@Table(name = "clientes")
class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null;
    var nome: String? = null;
    var endereco: String? = null;
    var telefone: String? = null;

    @OneToMany(mappedBy = "dono", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    var pets: List<Pet>? = null;


}