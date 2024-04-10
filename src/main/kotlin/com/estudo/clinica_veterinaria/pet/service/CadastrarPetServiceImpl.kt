package com.estudo.clinica_veterinaria.pet.service

import com.estudo.clinica_veterinaria.pet.domain.repository.PetRepository
import com.estudo.clinica_veterinaria.pet.domain.request.Pet
import com.estudo.clinica_veterinaria.pet.domain.response.PetResponse
import com.estudo.clinica_veterinaria.pet.domain.response.PetResponse.Companion.cadastrarPetResponse
import org.springframework.stereotype.Service

@Service
class CadastrarPetServiceImpl(
    private val petRepository: PetRepository
) : CadastrarPetService {
    override fun cadastrarPet(request: Pet): PetResponse {
        petRepository.save(request)
        return cadastrarPetResponse(request)
    }
}