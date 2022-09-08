package br.edu.uerr.loja.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.uerr.loja.repositorio.EmpresaRepositorio;

@Controller
public class EmpresaControle {

	@Autowired
	EmpresaRepositorio empresaRepositorio;
	
	@GetMapping("/empresa")
	public String abreEmpresa(Model modelo) {
		modelo.addAttribute("listaEmpresas", empresaRepositorio.findAll());
		return "empresa";
	}
	
	
	
	
}
