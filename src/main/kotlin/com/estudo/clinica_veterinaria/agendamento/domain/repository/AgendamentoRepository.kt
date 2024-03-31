package com.estudo.clinica_veterinaria.agendamento.domain.repository

import com.estudo.clinica_veterinaria.agendamento.domain.request.Agendamento
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AgendamentoRepository: JpaRepository<Agendamento, Long> {

}