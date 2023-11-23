package com.cibertec.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Habitacion;
import com.cibertec.repositorio.IHabitacionRepository;

@Service
public class HabitacionServiceImpl implements HabitacionService {
	
	@Autowired
	private IHabitacionRepository habitacionRepository;
	
	@Override
	public List<Habitacion> obtenerTodas() {
		return habitacionRepository.findAll();
	}
	
	@Override
	public Habitacion obtenerPorId(Integer id) {
		return habitacionRepository.findById(id).orElse(null);
	}
	
	@Override
	public void guardarCompra(Habitacion habitacion) {
		 habitacionRepository.save(habitacion);

	}

}
