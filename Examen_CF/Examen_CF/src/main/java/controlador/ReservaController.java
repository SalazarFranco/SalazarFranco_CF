package controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.modelo.Habitacion;
import com.cibertec.servicio.HabitacionService;


@Controller
public class ReservaController {
	private List<Habitacion> carrito = new ArrayList<Habitacion>();
	
	@Autowired
	private HabitacionService habitacionService;
	
	@PostMapping("/addtochart")
	public String addToChart(@RequestParam("Id") Integer Id) {
		Habitacion habitacion = habitacionService.obtenerPorId(Id);
		carrito.add(habitacion);
			
		return "redirect:/catalogo";
	}
	
	@GetMapping("/carro")
	public String mostrarCarrito(Model model) {
		model.addAttribute("productosEnCarrito", carrito);

		double montoTotal = carrito.stream().mapToDouble(Habitacion::getPrecio).sum();
		model.addAttribute("montoTotal", montoTotal);

		return "carrito";
	}
	
}
