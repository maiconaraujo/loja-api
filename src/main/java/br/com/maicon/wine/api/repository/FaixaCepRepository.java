package br.com.maicon.wine.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.maicon.wine.api.model.FaixaCep;

@Repository
public interface FaixaCepRepository extends JpaRepository<FaixaCep, Long>{
	
	@Query("from FaixaCep where :cep between faixaInicio and faixaFim")
	public FaixaCep findByCep(Long cep);     
	 
	@Query("from FaixaCep where :cepInicio between faixaInicio and faixaFim or :cepFim between faixaInicio and faixaFim")
	List<FaixaCep> findByFaixaCep(Long cepInicio, Long cepFim);   	
}
