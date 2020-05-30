package com.dmolina.sorting;

import java.util.Arrays;

public class ABM {
	
	static final int _PRECIO = 0;
	static final int _VELOCIDAD = 1;
	
	static void imprimirListado(Auto[] autos,int tipoListado) {
		String res = null;
		System.out.println("Listado de auto: ");
		
		for(int i =0; i< autos.length;i++) {
			switch(tipoListado) {
			case (0):
				res = "$"+autos[i].getPrecio();
				break;
			case (1):
				res = String.valueOf(autos[i].getMaxVelocidad()) + "km/h vel. max.";
				break;
			}
			
			System.out.println(autos[i].getMarca() + " " + autos[i].getModelo() + " - "+ res + " ");
		
		}
		
	}

	public static void main(String[] args) {
		Auto a1 = new Auto();
		a1.setMarca("Ford");
		a1.setModelo("Focus");
		a1.setPrecio(100000);
		a1.setMaxVelocidad(200);
		
		Auto a2 = new Auto();
		a2.setPrecio(150000);
		a2.setMarca("Fiat");
		a2.setModelo("Toro");
		a2.setMaxVelocidad(180);
		
		Auto a3 = new Auto();
		a3.setPrecio(90000);
		a3.setMarca("VW");
		a3.setModelo("Vento");
		a3.setMaxVelocidad(210);
		
		Auto[] autos = {a1,a2,a3};
		
		Arrays.sort(autos,new AutoPrecioComparador());
		
		System.out.println(" ");
		System.out.println("Listado ordenado por precios: ");
		imprimirListado(autos,_PRECIO);
		
		Arrays.parallelSort(autos,new AutoMaxVelComparador());
		
		System.out.println(" ");
		System.out.println("Listado ordenado por max velocidad");
		imprimirListado(autos,_VELOCIDAD);
		
	}

}
