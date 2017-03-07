package com.jetro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jetro.model.Relatorio;
import com.jetro.repository.RelatorioRepository;
import com.jetro.repository.UsuarioRepository;

@Controller
@RequestMapping("/relatorios")
public class RelatoriosController {
	
	@Autowired
	private RelatorioRepository relatorioRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@RequestMapping("/novo")
	public ModelAndView novoRelatorio(){
		ModelAndView mv = new ModelAndView("CadastroRelatorio");
//		Relatorio novoRelatorio = new Relatorio();
//		carregaDadosRelatorio(novoRelatorio);
//		mv.addObject("entidade", novoRelatorio);
		return mv;
	}

	private void carregaDadosRelatorio(Relatorio relatorio) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String idUsuario = auth.getName(); //pega usuario logado
	    relatorio.setIdCelula(usuarioRepository.findIdCelula(idUsuario));
	    // setar preletor
	}	
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Relatorio titulo){
		relatorioRepository.save(titulo);
		ModelAndView mv = new ModelAndView("CadastroRelatorio");
		mv.addObject("mensagem", "Relatório salvo com sucesso!");
		return mv;
	}
}
