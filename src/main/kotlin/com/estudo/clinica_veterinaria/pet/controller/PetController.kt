package com.estudo.clinica_veterinaria.pet.controller

import com.estudo.clinica_veterinaria.pet.domain.repository.PetRepository
import com.estudo.clinica_veterinaria.pet.domain.request.Pet
import com.estudo.clinica_veterinaria.pet.domain.response.PetResponse
import com.estudo.clinica_veterinaria.pet.service.CadastrarPetService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/clinicavet", MediaType.APPLICATION_JSON_VALUE)
class PetController(
    private val cadastrarPetService: CadastrarPetService,
    private val repository: PetRepository
) {

    @PostMapping("/pets")
    @ResponseStatus(HttpStatus.CREATED)
    fun cadastrarPet(@RequestBody request: Pet): PetResponse {
        return cadastrarPetService.cadastrarPet(request)
    }

    @GetMapping("/pets/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun buscarPet(@PathVariable id: Long): Any {
        val pet: Optional<Pet> = repository.findById(id)

        if (pet.isPresent){
            return pet
        }
        return HttpStatus.NOT_FOUND

    }
}