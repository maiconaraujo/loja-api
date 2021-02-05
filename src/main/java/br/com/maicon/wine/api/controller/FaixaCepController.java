package br.com.maicon.wine.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FaixaCepController {

	@GetMapping("/loja")
	public String getLojaByCep() {
		return "teste";
	}
}
