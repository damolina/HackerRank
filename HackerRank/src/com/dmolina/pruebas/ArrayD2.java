package com.dmolina.pruebas;

public class ArrayD2 {
	
    static int hourglassSum(int[][] arr) {
    	int sum = 0;
    	int aux = -100;
    	
    	for(int i=0; i<4;i++) {
    		for(int j=0; j<4;j++) {
	    		sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
			    sum = sum + arr[i+1][j+1];
			    sum = sum + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
			    System.out.print(sum + "     ");
			    if(sum > aux) {
			    	aux = sum;
			    } 
    		}
    		System.out.println("");
    	}
    	
    	return aux;

    }


	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		 
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = (int) Math.round(Math.random()*20) - 10;
                System.out.print(arr[i][j] + "     ");
            }
            System.out.println("");
        }
        
        System.out.println("#################");

        int result = hourglassSum(arr);
        
        System.out.println("result: " + result);

	}

}
