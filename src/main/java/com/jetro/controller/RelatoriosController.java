package com.jetro.controller;

import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jetro.model.Relatorio;
import com.jetro.repository.RelatorioRepository;
import com.jetro.service.MembroService;
import com.jetro.service.UsuarioService;

@Controller
@RequestMapping("/relatorios")
public class RelatoriosController {
	
	@Autowired
	private RelatorioRepository relatorioRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired 
	private MembroService membroService;
	
	@RequestMapping("/novo")
	public ModelAndView novoRelatorio(){
		ModelAndView mv = new ModelAndView("CadastroRelatorio");
		mv.addObject("nomeCelula", usuarioService.findNomeCelula(pegaIdUsuarioLogado()));
		mv.addObject("dataDeHoje", getDataHojeSimples());
		return mv;
	}

	private String getDataHojeSimples() {
		DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/yyyy");
		return dtf.print(DateTime.now());
	}
	
	private void carregaDadosRelatorio(Relatorio relatorio) {
		String idUsuario = pegaIdUsuarioLogado();
	    
	    if(usuarioService.checaUsuarioEstaAtivoNaCelula(idUsuario))
	    {
		    relatorio.setIdCelula(usuarioService.findIdCelula(idUsuario));
	    }
	    
	    relatorio.setIndDificuldade("N");
	    relatorio.setIndOracao("N");
	    relatorio.setIndSituacao("A");
	}

	private String pegaIdUsuarioLogado() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String idUsuario = auth.getName(); //pega usuario logado
		return idUsuario;
	}	

	@ModelAttribute("listaPreletores")
	public Map<Long, String> listaPreletores(){
		String idUsuario = pegaIdUsuarioLogado();
		Long idCelula = usuarioService.findIdCelula(idUsuario);
		return membroService.getListaPreletoresCelula(idCelula);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Relatorio relatorio) throws Exception{
		carregaDadosRelatorio(relatorio);
		relatorioRepository.save(relatorio);
		ModelAndView mv = new ModelAndView("CadastroRelatorio");
		mv.addObject("mensagem", "Relatório salvo com sucesso!");
		return mv;
	}
}
