package com.estudo.clinica_veterinaria.pet.domain.response

import com.estudo.clinica_veterinaria.pet.domain.request.Genero
import com.estudo.clinica_veterinaria.pet.domain.request.Pet

data class PetResponse (
    var nome: String? = null,
    var genero: String? = null,
    var idade: String? = null,
    var raca: String? = null
){
    companion object{
        fun cadastrarPetResponse(request: Pet): PetResponse{
            return PetResponse(
                request.nome,
                request.genero,
                request.idade,
                request.raca)
        }
    }
}