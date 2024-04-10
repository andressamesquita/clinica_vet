package com.estudo.clinica_veterinaria.cliente.service

import com.estudo.clinica_veterinaria.cliente.domain.request.Cliente
import com.estudo.clinica_veterinaria.cliente.domain.response.ClienteResponse
import org.springframework.stereotype.Service

@Service
interface CadastrarClienteService {
    fun cadastrarCliente(
        request: Cliente
    ): ClienteResponse
}