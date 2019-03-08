package br.usjt.previsao_tempo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class PrevTempo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String nSemana;
	private double tempMinima;
	private double tempMaxima;
	private double humidade;
	private String descSucinta;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getnSemana() {
		return nSemana;
	}
	public void setnSemana(String nSemana) {
		this.nSemana = nSemana;
	}
	public double getTempMinima() {
		return tempMinima;
	}
	public void setTempMinima(double tempMinima) {
		this.tempMinima = tempMinima;
	}
	public double getTempMaxima() {
		return tempMaxima;
	}
	public void setTempMaxima(double tempMaxima) {
		this.tempMaxima = tempMaxima;
	}
	public double getHumidade() {
		return humidade;
	}
	public void setHumidade(double humidade) {
		this.humidade = humidade;
	}
	public String getDescSucinta() {
		return descSucinta;
	}
	public void setDescSucinta(String descSucinta) {
		this.descSucinta = descSucinta;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
