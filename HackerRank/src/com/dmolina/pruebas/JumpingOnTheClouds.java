package com.dmolina.pruebas;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		int cant_saltos = 0;
		boolean tiene_doble_salto = false;
		int[] c = {0,0,0,0,1,0};
		int n = c.length;
		
		for(int i=0; i < n;i++) {
			tiene_doble_salto = false;
			if((i < n - 2) && c[i+2]==0) {
				tiene_doble_salto = true;
				cant_saltos++;
				i =  i + 1;
			}else if((i < n - 1) && c[i+1]==1) {
				cant_saltos++;
			}else if((i < n - 1) && !tiene_doble_salto && c[i+1]==0) {
				cant_saltos++;
			}
		}
		
		System.out.println("cant_saltos: " + cant_saltos);
	
	}

}
