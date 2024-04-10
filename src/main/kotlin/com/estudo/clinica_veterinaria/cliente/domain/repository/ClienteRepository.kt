package com.estudo.clinica_veterinaria.cliente.domain.repository

import com.estudo.clinica_veterinaria.cliente.domain.request.Cliente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepository: JpaRepository<Cliente, Long> {
}