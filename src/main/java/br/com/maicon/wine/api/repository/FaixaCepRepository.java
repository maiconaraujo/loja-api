package br.com.maicon.wine.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.maicon.wine.api.model.FaixaCep;

@Repository
public interface FaixaCepRepository extends JpaRepository<FaixaCep, Long>{

}
