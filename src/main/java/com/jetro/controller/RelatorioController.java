package com.jetro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jetro.model.Relatorio;
import com.jetro.repository.Relatorios;

@Controller
@RequestMapping("/relatorios")
public class RelatorioController {
	
	@Autowired
	private Relatorios relatorios;
	
	@RequestMapping("/novo")
	public ModelAndView novo(){
		ModelAndView mv = new ModelAndView("CadastroRelatorio");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Relatorio titulo){
		relatorios.save(titulo);
		ModelAndView mv = new ModelAndView("CadastroRelatorio");
		mv.addObject("mensagem", "Relatório salvo com sucesso!");
		return mv;
	}
	
	@RequestMapping("lista")
	public String pesquisar(){
		return "ListaRelatoriosCelulas";
	}
	
//	@ModelAttribute("todosStatusTitulo")
//	public List<StatusTitulo> todosStatusTitulo() {
//		return Arrays.asList(StatusTitulo.values());
//	}

}
