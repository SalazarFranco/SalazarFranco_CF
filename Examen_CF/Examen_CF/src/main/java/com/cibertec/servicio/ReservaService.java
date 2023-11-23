package com.cibertec.servicio;

import java.util.List;

import com.cibertec.modelo.Reserva;

public interface ReservaService {
	List<Reserva> obtenerTodos();
    Reserva obtenerPorId(Integer id);
    void guardarReserva(Reserva reserva);
}
