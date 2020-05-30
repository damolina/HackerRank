package com.dmolina.arrays;

import com.dmolina.util.Util;

public class MinimumSwaps2 {

	public static void main(String[] args) {
		int[] arr = {1,3,5,2,4,6,7};
		
		System.out.println("Array desordenado: ");
		printArray(arr);
		
		int res = minimumSwaps(arr);

		
		System.out.println("\nArray ordenado: ");
		Util.printArray(arr);
		
		System.out.println("\nsteps: " + res);
	

	}
	
    static int minimumSwaps(int[] arr) {
    	int res = 0;
    	int aux = 0;
    	int i = 0;
    	
    	while(i<arr.length) {
    		if(arr[i] != arr[arr[i] - 1]) {
    			aux = arr[arr[i] - 1];
    			arr[arr[i] - 1] = arr[i]; 
    			arr[i] = aux;
    			res++;
    		}else {
    			i++;
    		}
    	}
    	return res;
    }
    
    static void printArray(int[] arr) {
    	for(int i=0;i<arr.length;i++){
    		System.out.print(arr[i]+" ");
    	}
    }

}
