package br.com.maicon.wine.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maicon.wine.api.exeption.NegocioException;
import br.com.maicon.wine.api.model.FaixaCep;
import br.com.maicon.wine.api.repository.FaixaCepRepository;

@Service
public class FaixaCepServiceImpl implements FaixaCepService{
	
	@Autowired
	private FaixaCepRepository faixaCepRepository;
	
	@Override
	public FaixaCep salvar(FaixaCep faixaCep) {
		return faixaCepRepository.save(faixaCep);
	}
	
	@Override
	public FaixaCep alterar(FaixaCep faixaCep) {
		if(!faixaCepRepository.existsById(faixaCep.getId())) {
			throw new NegocioException("ID inválido");
		}
		
		return faixaCepRepository.save(faixaCep);
	}
		
	
	@Override
	public void excluir(Long id) {
		if(!faixaCepRepository.existsById(id)) {
			throw new RuntimeException("Id inválido");
		}
		
		faixaCepRepository.deleteById(id);
	}

	@Override
	public FaixaCep buscaPorCep(Long cep) {
		// TODO Auto-generated method stub
		return null;
	}

}
