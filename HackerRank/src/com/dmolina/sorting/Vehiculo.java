package com.dmolina.sorting;

public abstract class Vehiculo {
	boolean estado = false;
	
	public void iniciarMarcha() {
		if(!estado) {
			estado = true;
		}
	}
	
	public void finalizarMarcha() {
		if(estado) {
			estado = false;
		}
	}
}
