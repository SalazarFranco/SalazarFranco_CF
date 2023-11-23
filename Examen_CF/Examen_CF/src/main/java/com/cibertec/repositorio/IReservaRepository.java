package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelo.Reserva;
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {

}
