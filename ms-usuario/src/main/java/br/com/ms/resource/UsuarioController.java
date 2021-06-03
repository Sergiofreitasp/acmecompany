package br.com.ms.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ms.model.Usuario;
import br.com.ms.service.UsuarioService;

@RestController
@RequestMapping("v1/api/usuarios")
public class UsuarioController {
	
	@Autowired
	public UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> lista(){
		return ResponseEntity.ok(this.service.listarUsuario());
	}
}
