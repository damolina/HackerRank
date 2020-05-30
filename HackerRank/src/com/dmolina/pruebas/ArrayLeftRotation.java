package com.dmolina.pruebas;

public class ArrayLeftRotation {
	
    static int[] rotLeft(int[] a, int d) {
    	int l = a.length;
    	int aux;	
    	
    	for(int i = 0;i < d;i++) {
	    	aux= a[0];
			for(int j = 0;j<l - 1;j++) {
				a[j] = a[j+1];
			}
			a[l-1] = aux; 		
    	}
    	
    	for(int i = 0;i < l;i++) {
    		System.out.print(a[i] + " ");
    	}

    	return a;
    }

	public static void main(String[] args) {
		int n = 5;
		int d = 4;
		int[] a = new int[n];
		
		System.out.println("Vector original: ");
		for(int i=0; i<n;i++) {
			a[i] = (int) Math.floor(Math.random()*10);
		}
		
		for(int i=0; i<n;i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println(" ");		
		System.out.println("Vector rotado " + d + " veces");
		int[] result = rotLeft(a, d);

	}

}
