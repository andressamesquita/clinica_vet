package com.estudo.clinica_veterinaria.agendamento.domain.response

import com.estudo.clinica_veterinaria.agendamento.domain.request.Agendamento
import com.estudo.clinica_veterinaria.cliente.domain.request.Cliente
import com.estudo.clinica_veterinaria.pet.domain.request.Pet

data class AgendamentoResponse(
    var data: String? = null,
    var hora: String? = null,
    var cliente: Cliente? = null,
    var pet: Pet? = null
){
    companion object{
        fun criarResponse(request: Agendamento): AgendamentoResponse {
            return AgendamentoResponse(
                request.data,
                request.hora,
                request.cliente,
                request.pet
            )
        }
    }
}
