package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.modelo.Usuario;
import com.cibertec.repositorio.IUsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@GetMapping("/listado")
    public String listarUsuarios(Model model) {
        List<Usuario> usuario = usuarioRepository.findAll();
        model.addAttribute("usuario", usuario);
        return "listado"; 
    }

}
