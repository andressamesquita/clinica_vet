package com.estudo.clinica_veterinaria.cliente.controller

import com.estudo.clinica_veterinaria.cliente.domain.repository.ClienteRepository
import com.estudo.clinica_veterinaria.cliente.domain.request.Cliente
import com.estudo.clinica_veterinaria.cliente.domain.response.ClienteResponse
import com.estudo.clinica_veterinaria.cliente.service.CadastrarClienteService
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
class ClienteController(
    private val cadastrarClienteService: CadastrarClienteService,
    private val repository: ClienteRepository
) {

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    fun cadastraCliente(@RequestBody request: Cliente): ClienteResponse {
        return cadastrarClienteService.cadastrarCliente(request)
    }

    @GetMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun buscarCliente(@PathVariable id: Long): Any{
        val cliente: Optional<Cliente> = repository.findById(id)

        if (cliente.isPresent){
            return cliente
        }
        return HttpStatus.NOT_FOUND

    }


}