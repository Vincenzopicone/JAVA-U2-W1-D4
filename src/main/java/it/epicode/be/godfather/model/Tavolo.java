package it.epicode.be.godfather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
//@Getter
//@Setter
@Data
public class Tavolo {
	private final Integer numero;
	private final Integer numeroMassimoCoperti;
	private Boolean occupato = false;

	
	
//	public Boolean getOccupato() {
//		return occupato;
//	}
//	public void setOccupato(Boolean occupato) {
//		this.occupato = occupato;
//	}
//	public Integer getNumero() {
//		return numero;
//	}
//	public Integer getNumeroMassimoCoperti() {
//		return numeroMassimoCoperti;
//	}
	
}
