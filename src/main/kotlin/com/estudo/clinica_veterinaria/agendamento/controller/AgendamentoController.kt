package com.estudo.clinica_veterinaria.agendamento.controller

import com.estudo.clinica_veterinaria.agendamento.domain.repository.AgendamentoRepository
import com.estudo.clinica_veterinaria.agendamento.domain.request.Agendamento
import com.estudo.clinica_veterinaria.agendamento.domain.response.AgendamentoResponse
import com.estudo.clinica_veterinaria.agendamento.service.CriarAgendamentoService
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
class AgendamentoController(
    private val criarAgendamentoService: CriarAgendamentoService,
    private val repository: AgendamentoRepository
) {

    @PostMapping("/agendamentos")
    @ResponseStatus(HttpStatus.CREATED)
    fun criarAgendamento(@RequestBody request: Agendamento): AgendamentoResponse {
        return criarAgendamentoService.criarAgendamento(request)
    }

    @GetMapping("/agendamentos/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun buscarAgendamento(@PathVariable id: Long): Any {
        val agendamento: Optional<Agendamento> = repository.findById(id)

        if (agendamento.isPresent){
            return agendamento
        }
        return HttpStatus.NOT_FOUND
    }
}