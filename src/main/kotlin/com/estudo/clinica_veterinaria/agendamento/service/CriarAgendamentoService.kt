package com.estudo.clinica_veterinaria.agendamento.service

import com.estudo.clinica_veterinaria.agendamento.domain.request.Agendamento
import com.estudo.clinica_veterinaria.agendamento.domain.response.AgendamentoResponse
import org.springframework.stereotype.Service

@Service
interface CriarAgendamentoService {

    fun criarAgendamento(
        request: Agendamento
    ): AgendamentoResponse
}