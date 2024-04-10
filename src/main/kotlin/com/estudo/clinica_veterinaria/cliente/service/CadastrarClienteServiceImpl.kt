package com.estudo.clinica_veterinaria.cliente.service

import com.estudo.clinica_veterinaria.cliente.domain.repository.ClienteRepository
import com.estudo.clinica_veterinaria.cliente.domain.request.Cliente
import com.estudo.clinica_veterinaria.cliente.domain.response.ClienteResponse
import com.estudo.clinica_veterinaria.cliente.domain.response.ClienteResponse.Companion.cadastrarClienteResponse
import org.springframework.stereotype.Service

@Service
class CadastrarClienteServiceImpl(
    private val clienteRepository: ClienteRepository
) : CadastrarClienteService {
    override fun cadastrarCliente(request: Cliente): ClienteResponse {
     clienteRepository.save(request)
     return cadastrarClienteResponse(request)
    }

}