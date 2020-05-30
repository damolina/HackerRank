package com.dmolina.pruebas;

public class BlubbleSort {
	
	//swap    a       
	//0       [6,4,1]
	//1       [4,6,1]
	//2       [4,1,6]
	//3       [1,4,6]
	
	static void imprimir(int[] listado){
		
		for(int i=0;i<listado.length;i++) {
			System.out.print(listado[i]);
		}
	}
	
	
    static void countSwaps(int[] a) {
    	int cant = 0;
    	int aux;
    	
    	for(int i=0;i<a.length;i++) {
    		for(int j=i;j<a.length;j++) {
	    		if(a[i] > a[j]){
	    			aux = a[j];
	    			a[j] = a[i];
	    			a[i] = aux;
	    			cant++;
	    		}
    		}
    	}
		
		System.out.println("Array is sorted in "+cant+" swaps.");
		System.out.println("First Element: "+a[0]);  
		System.out.println("Last Element: "+a[a.length-1]);
    }

	public static void main(String[] args) {
		int n = 3;
		int[] listado = new int[n];
		
		listado[0] = 3;
		listado[1] = 1;
		listado[2] = 2;
		
    	System.out.println("Array inicial: ");
    	imprimir(listado);
		
		countSwaps(listado);
	}

}
