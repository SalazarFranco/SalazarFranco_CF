package com.cibertec.servicio;

import java.util.List;

import com.cibertec.modelo.Habitacion;

public interface HabitacionService {
	
	List<Habitacion> obtenerTodas();
	Habitacion obtenerPorId(Integer id);
	void guardarCompra(Habitacion habitacion);

}
