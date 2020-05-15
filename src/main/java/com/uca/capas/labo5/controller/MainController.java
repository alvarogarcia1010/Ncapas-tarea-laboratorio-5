package com.uca.capas.labo5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.labo5.dao.EstudianteDAO;
import com.uca.capas.labo5.domain.Estudiante;

@Controller
public class MainController {
	@Autowired
	private EstudianteDAO estudianteDAO;
	
	@RequestMapping("/")
	public String init() {
		return "redirect:/inicio";
	}
	
	@RequestMapping("/inicio")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Estudiante estudiante = new Estudiante();
		mav.addObject("estudiante", estudiante);
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping("/listado")
	public ModelAndView listado() {
		ModelAndView mav = new ModelAndView();
		List<Estudiante> estudiantes = null;
		
		try {
			estudiantes = estudianteDAO.getAll();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		mav.addObject("estudiantes", estudiantes);
		mav.setViewName("listado");
		
		return mav;
	}
	
}
