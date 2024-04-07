package com.estudo.clinica_veterinaria.agendamento.domain.response

import com.estudo.clinica_veterinaria.agendamento.domain.request.Agendamento

data class AgendamentoResponse(
    var data: String? = null,
    var hora: String? = null,
    var cliente: String? = null,
    var pet: String? = null
){
    companion object{
        fun criarResponse(request: Agendamento): AgendamentoResponse {
            return AgendamentoResponse(request.data, request.hora, request.cliente, request.pet)
        }
    }
}
