package com.estudo.clinica_veterinaria.agendamento.controller

import com.estudo.clinica_veterinaria.agendamento.domain.repository.AgendamentoRepository
import com.estudo.clinica_veterinaria.agendamento.domain.request.Agendamento
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import java.net.URI
import java.util.*

@RestController
@RequestMapping("/clinicavet", MediaType.APPLICATION_JSON_VALUE)
class AgendamentoController(private var repository: AgendamentoRepository) {

    @PostMapping("/agendamentos")
    fun criarAgendamento(@RequestBody request: Agendamento, uriBuilder: UriComponentsBuilder): ResponseEntity<Agendamento> {

        repository.save(request)

        val uri: URI = uriBuilder.path("/agendamentos/{id}").buildAndExpand(request.id).toUri()

        return ResponseEntity.created(uri).body(request)

    }

    @GetMapping("/{id}")
    fun buscarAgendamento(@PathVariable id: Long): ResponseEntity<Optional<Agendamento>> {
        val agendamento: Optional<Agendamento> = repository.findById(id)

        if (agendamento.isPresent){
            return ResponseEntity.ok(agendamento)
        }
        return ResponseEntity.notFound().build()

    }
}