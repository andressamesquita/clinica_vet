package com.estudo.clinica_veterinaria.pet.service

import com.estudo.clinica_veterinaria.pet.domain.request.Pet
import com.estudo.clinica_veterinaria.pet.domain.response.PetResponse
import org.springframework.stereotype.Service

@Service
interface CadastrarPetService {
    fun cadastrarPet(
        request: Pet
    ): PetResponse
}