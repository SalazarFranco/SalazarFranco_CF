package controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.modelo.Reserva;
import com.cibertec.servicio.ReservaService;

@Controller
public class CarritoController {
	private List<Reserva> carrito = new ArrayList<>();
	@Autowired
    private ReservaService reservaService;

    @PostMapping("/addtochart")
    public String addToChart(@RequestParam("reservaId") Integer reservaId) {
        Reserva reserva = reservaService.obtenerPorId(reservaId);
        carrito.add(reserva);

        return "redirect:/catalogo";
    }

    @GetMapping("/carrito")
    public String mostrarCarrito(Model model) {
        model.addAttribute("reservaEnCarrito", carrito);

        double montoTotal = carrito.stream().mapToDouble(Reserva::getTotal).sum();
        model.addAttribute("montoTotal", montoTotal);

        return "carrito";
    }
}
