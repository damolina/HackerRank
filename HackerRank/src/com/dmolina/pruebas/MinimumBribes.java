package com.dmolina.pruebas;

public class MinimumBribes {

    static void minimumBribes(int[] q) {
    	/*
    	 * no performante en cantidades > 99999
    	int c = 0;
    	int n = q.length;
    	for(int i=0;i<n;i++) {
    		if((q[i] - (i+1)) > 2){
				System.out.println("Too chaotic");
				return;
    		}
    		for(int j = i;j<n;j++) {
    			if(q[i] > q[j]) 
    				c++;
    		}
    	}
    	System.out.println(c);
    	*/
    	
    	int sobornos = 0;
    	int valorEsperadoPrim 	= 1;
    	int valorEsperadoSeg 	= 2;
    	int valorEsperadoTerc 	= 3;
    	
    	for(int i=0;i < q.length;i++) {
    		if(q[i] == valorEsperadoPrim) {
    			valorEsperadoPrim 	= 	valorEsperadoSeg;
    			valorEsperadoSeg	=	valorEsperadoTerc;
    			valorEsperadoTerc++;
    		}else if(q[i] == valorEsperadoSeg) {
    			sobornos++;
    			valorEsperadoSeg	=	valorEsperadoTerc;
    			valorEsperadoTerc++;
    		}else if(q[i] == valorEsperadoTerc) {
    			sobornos +=2;
    			valorEsperadoTerc++;
    		}else {
				System.out.println("Too chaotic");
				return;
    		}
    	}
    	System.out.println(sobornos);
    }
   
	public static void main(String[] args) {
		int n = 8;
		int[] q = new int[n];

		q[0] = 1;
		q[1] = 2;
		q[2] = 5;
		q[3] = 3;
		q[4] = 4;	
		q[5] = 7;
		q[6] = 8;
		q[7] = 6;	
		
		 minimumBribes(q);
	}

}
