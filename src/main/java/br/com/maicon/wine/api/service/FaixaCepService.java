package br.com.maicon.wine.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maicon.wine.api.model.FaixaCep;
import br.com.maicon.wine.api.repository.FaixaCepRepository;

@Service
public class FaixaCepService {
	
	@Autowired
	private FaixaCepRepository faixaCepRepository;
	
	public FaixaCep salvar(FaixaCep faixaCep) {
		return faixaCepRepository.save(faixaCep);
	}
	
	public FaixaCep alterar(FaixaCep faixaCep) {
		
		return faixaCepRepository.save(faixaCep);
	}
		
	
	
	public void excluir(Long id) {
		faixaCepRepository.deleteById(id);
	}

}
