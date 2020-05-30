package com.dmolina.pruebas;

public class RepeatedString {

	public static void main(String[] args) {
		//input
		int n = 10;
		String s = "aba";
		
		int cant_letras = s.length();
		String[] c = s.split("");
		int cant_aes = 0;
		long cant_aes_en_n = 0;
		long result = 0;
		float remanente = 0;
		
		for(int i=0 ; i < cant_letras;i++){
			if(c[i].equalsIgnoreCase("a")) {
				cant_aes++;
			}
		}
		
		result = n / cant_letras;
		remanente = n - (result * cant_letras);
		cant_aes_en_n = result * cant_aes;
		
		for(int j = 0; j<remanente;j++) {
			if(c[j].equalsIgnoreCase("a")) {
				cant_aes_en_n++;
			}
		}
		
		System.out.println("cant_aes: " + cant_aes_en_n);

	}

}
