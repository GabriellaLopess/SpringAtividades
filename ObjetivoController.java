package com.generation.objetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {

	@GetMapping
	public String objetivo() {
	return "Desejo aprender tudo do bloco que estou estudando no momento"; }

}
