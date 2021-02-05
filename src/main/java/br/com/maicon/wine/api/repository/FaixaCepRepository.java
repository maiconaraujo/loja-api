package br.com.maicon.wine.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.maicon.wine.api.model.FaixaCep;

@Repository
public interface FaixaCepRepository extends JpaRepository<FaixaCep, Long>{
	
	@Query("from FaixaCep where :cep between faixaInicio and faixaFim")
	FaixaCep findByCep(Long cep);   
	
}
