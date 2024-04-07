package com.estudo.clinica_veterinaria.agendamento.service

import com.estudo.clinica_veterinaria.agendamento.domain.repository.AgendamentoRepository
import com.estudo.clinica_veterinaria.agendamento.domain.request.Agendamento
import com.estudo.clinica_veterinaria.agendamento.domain.response.AgendamentoResponse
import org.springframework.stereotype.Service

@Service
class CriarAgendamentoServiceImpl(
    private val agendamentosRepository: AgendamentoRepository
) : CriarAgendamentoService {
    override fun criarAgendamento(request: Agendamento): AgendamentoResponse {
        agendamentosRepository.save(request)
        val response = AgendamentoResponse(request.data, request.hora, request.cliente, request.pet)
        return response
    }
}