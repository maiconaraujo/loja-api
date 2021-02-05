package br.com.maicon.loja.api.service;

import br.com.maicon.loja.api.model.FaixaCep;

public interface FaixaCepService {
	
	FaixaCep salvar(FaixaCep faixaCep);
	FaixaCep alterar(FaixaCep faixaCep);
	void excluir(Long id);
	FaixaCep buscaPorCep(Long cep);	

}
