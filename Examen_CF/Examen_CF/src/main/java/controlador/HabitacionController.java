package controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.servicio.HabitacionService;

@Controller
public class HabitacionController {
	
	@Autowired
	private HabitacionService habitacionService;
	
	@GetMapping("/catalogo")
	public String mostrarLista(Model model) {
		model.addAttribute("habitaciones", habitacionService.obtenerTodas());
		return "catalogo";
	}

}
