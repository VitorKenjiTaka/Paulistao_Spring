package br.edu.fateczl.Paulistao_Spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.edu.fateczl.Paulistao_Spring.persistence.ConsultaGrupoDao;

@Controller
public class ConsultaGrupoController {

	@Autowired
	ConsultaGrupoDao cgDao;
	
	@RequestMapping(name = "consultagrupo", value = "/consultagrupo", method = RequestMethod.GET)
	public ModelAndView init(ModelMap model) {
		return new ModelAndView("consultagrupo");
	}

	@RequestMapping(name = "consultagrupo", value = "/consultagrupo", method = RequestMethod.POST)
	public ModelAndView fazgrupo(ModelMap model, @RequestParam Map<String, String> allParam) {
		return new ModelAndView("consultagrupo");
	}
	
}
