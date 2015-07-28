package br.com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springmvc.repository.JpaRepository;

@Controller
public class JpaController {
	
	@Autowired
	private JpaRepository repository;

	@RequestMapping("/jpa")
	public String conexaoEstabelecida() {
		repository.create();
		return "home";
	}

}