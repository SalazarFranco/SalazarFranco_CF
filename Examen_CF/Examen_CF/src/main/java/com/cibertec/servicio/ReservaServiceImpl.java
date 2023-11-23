package com.cibertec.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Reserva;
import com.cibertec.repositorio.IReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService{
	 @Autowired
	    private IReservaRepository reservaRepository;

	    @Override
	    public List<Reserva> obtenerTodos() {
	        return reservaRepository.findAll();
	    }

	    @Override
	    public Reserva obtenerPorId(Integer id) {
	        return reservaRepository.findById(id).orElse(null);
	    }

	    @Override
	    public void guardarReserva(Reserva reserva) {
	        reservaRepository.save(reserva);

	    }
}
