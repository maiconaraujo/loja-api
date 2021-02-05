package br.com.maicon.wine.api.service;

import java.util.List;

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
		validaFaixa(faixaCep);
		
		return faixaCepRepository.save(faixaCep);
	}
	
	@Override
	public FaixaCep alterar(FaixaCep faixaCep) {
		validaFaixa(faixaCep);
		
		if(!faixaCepRepository.existsById(faixaCep.getId())) {
			throw new NegocioException("ID inválido");
		}
		
		return faixaCepRepository.save(faixaCep);
	}
	
	private void validaFaixa(FaixaCep faixaCep) {
		if(faixaCep.getFaixaInicio() > faixaCep.getFaixaFim()) {
			throw new NegocioException("Faixa início não pode ser maior que faixa fim.");
		}
		
		List<FaixaCep> lista = faixaCepRepository.findByFaixaCep(faixaCep.getFaixaInicio() , faixaCep.getFaixaFim());
		
		
		if(!lista.isEmpty()) {
			throw new NegocioException("A faixa de cep conflita com a(s) faixa(s) já cadastrada(s).");
		}
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
		return faixaCepRepository.findByCep(cep);
		
	}

}
