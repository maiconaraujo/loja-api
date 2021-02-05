package br.com.maicon.wine.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.maicon.wine.api.model.FaixaCep;
import br.com.maicon.wine.api.service.FaixaCepService;

@RestController
@RequestMapping("/faixas-cep")
public class FaixaCepController {
	
	@Autowired
	private FaixaCepService faixaCepService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public FaixaCep adicionar(@Valid @RequestBody FaixaCep faixaCep) {
		 return faixaCepService.salvar(faixaCep);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void atualizar(@Valid @PathVariable Long id, @RequestBody FaixaCep faixaCep) {
		faixaCep.setId(id);
		faixaCepService.alterar(faixaCep);
	}	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void remover(@PathVariable Long id) {
		faixaCepService.excluir(id);
	}		
}
