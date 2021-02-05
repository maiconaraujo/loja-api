package br.com.maicon.wine.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "faixa_cep")
public class FaixaCep {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "codigo_loja")
	private String codigoLoja;
	
	@NotEmpty
	@Column(name = "faixa_inicio")
	private Long faixaInicio;
	
	@NotEmpty
	@Column(name = "faixa_fim")
	private Long faixaFim;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigoLoja() {
		return codigoLoja;
	}
	public void setCodigoLoja(String codigoLoja) {
		this.codigoLoja = codigoLoja;
	}
	public Long getFaixaInicio() {
		return faixaInicio;
	}
	public void setFaixaInicio(Long faixaInicio) {
		this.faixaInicio = faixaInicio;
	}
	public Long getFaixaFim() {
		return faixaFim;
	}
	public void setFaixaFim(Long faixaFim) {
		this.faixaFim = faixaFim;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaixaCep other = (FaixaCep) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
