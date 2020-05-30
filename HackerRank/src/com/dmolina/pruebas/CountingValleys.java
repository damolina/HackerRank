package com.dmolina.pruebas;

public class CountingValleys {

	public static void main(String[] args) {
		int n = 14;
		int nivel_mar = 0;
		int cant_valle = 0;
		String s = "DDDUUDDUUUDDUU";
		String[] listado = s.split("");
		
		for(int i=0;i < n;i++) {
			if(listado[i].equalsIgnoreCase("D")) {
				nivel_mar--;
			}else {
				nivel_mar++;
			}
			
			if(nivel_mar == -1 && listado[i].equalsIgnoreCase("D")) {
				cant_valle++;
			}
		}
		System.out.println("Cantidad de valles: " + cant_valle);
	}

}
