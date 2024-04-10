package com.estudo.clinica_veterinaria.pet.domain.repository

import com.estudo.clinica_veterinaria.pet.domain.request.Pet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PetRepository: JpaRepository<Pet, Long> {
}