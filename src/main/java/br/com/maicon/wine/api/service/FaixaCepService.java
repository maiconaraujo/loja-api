package br.com.maicon.wine.api.service;

import br.com.maicon.wine.api.model.FaixaCep;

public interface FaixaCepService {
	
	FaixaCep salvar(FaixaCep faixaCep);
	FaixaCep alterar(FaixaCep faixaCep);
	void excluir(Long id);
	FaixaCep buscaPorCep(Long cep);	

}
