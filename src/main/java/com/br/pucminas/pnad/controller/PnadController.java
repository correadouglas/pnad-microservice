package com.br.pucminas.pnad.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.pucminas.pnad.model.Pnad;

@RestController
public class PnadController {

	@GetMapping
	public List<Pnad> pesquisar() {
		
		return null;
		
	}
	
}
