package com.jetro.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jetro.model.StatusTitulo;
import com.jetro.model.Relatorio;
import com.jetro.repository.Titulos;

@Controller
@RequestMapping("/relatorios")
public class RelatorioController {
	
	@Autowired
	private Titulos titulos;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("CadastroRelatorio");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Relatorio titulo){
		titulos.save(titulo);
		ModelAndView mv = new ModelAndView("CadastroRelatorio");
		mv.addObject("mensagem", "Relatório salvo com sucesso!");
		return mv;
	}
	
	@RequestMapping
	public String pesquisar(){
		return "ListaRelatoriosCelulas";
	}
	
	@ModelAttribute("todosStatusTitulo")
	public List<StatusTitulo> todosStatusTitulo() {
		return Arrays.asList(StatusTitulo.values());
	}

}
