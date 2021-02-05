package br.com.maicon.wine.api.model;

public class FaixaCep {

	private Long id;
	private String codigoLoja;
	private Long faixaInicio;
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
	
	
}
