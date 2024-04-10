package com.estudo.clinica_veterinaria.cliente.domain.response

import com.estudo.clinica_veterinaria.cliente.domain.request.Cliente
import com.estudo.clinica_veterinaria.pet.domain.request.Pet

data class ClienteResponse (
    var nome: String? = null,
    var endereco: String? = null,
    var telefone: String? = null,
    var pets: List<Pet>? = null,
){
    companion object {
        fun cadastrarClienteResponse(request: Cliente): ClienteResponse {
            return ClienteResponse(
                request.nome,
                request.endereco,
                request.telefone,
                request.pets
            )
        }

    }
}