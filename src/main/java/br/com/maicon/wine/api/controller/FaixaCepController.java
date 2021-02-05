package br.com.maicon.wine.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.maicon.wine.api.model.FaixaCep;
import br.com.maicon.wine.api.service.FaixaCepServiceImpl;

@RestController
@RequestMapping("/faixas-cep")
public class FaixaCepController {
	
	@Autowired
	private FaixaCepServiceImpl service;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public FaixaCep adicionar(@Valid @RequestBody FaixaCep faixaCep) {
		 return service.salvar(faixaCep);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public FaixaCep atualizar(@Valid @PathVariable Long id, @RequestBody FaixaCep faixaCep) {
		faixaCep.setId(id);
		return service.alterar(faixaCep);
	}	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id) {
		service.excluir(id);
	}		
	
	@GetMapping("/search")
	public ResponseEntity<FaixaCep> buscaPorCep(@RequestParam Long cep) {
		FaixaCep faixaCep =  service.buscaPorCep(cep);
		
		if(faixaCep != null) {
			return ResponseEntity.ok(faixaCep);
		}
		
		return ResponseEntity.notFound().build();
		
	}
}
