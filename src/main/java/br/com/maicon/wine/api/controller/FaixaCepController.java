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
import br.com.maicon.wine.api.repository.FaixaCepRepository;

@RestController
@RequestMapping("/faixas-cep")
public class FaixaCepController {
	
	@Autowired
	private FaixaCepRepository faixaCepRepository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void adicionar(@Valid @RequestBody FaixaCep faixaCep) {
		 faixaCepRepository.save(faixaCep);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void atualizar(@Valid @PathVariable Long id, @RequestBody FaixaCep faixaCep) {
		 faixaCepRepository.save(faixaCep);
	}	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void remover(@PathVariable Long id) {
		 faixaCepRepository.deleteById(id);
	}		
}
