package com.dmolina.algorithms;

public class Kangaroo {

	public static void main(String[] args) {
		int x1 = 0;
		int v1 = 2;
		int x2 = 5;
		int v2 = 3;
		String res = kangaroo(x1,v1,x2,v2);
		System.out.println(res);
	}
	
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	String res = "NO";   
    	int c = 0;
    	int aux;
    	int currentx1 = x1;
    	int currentx2 = x2;
    	    	
    	if(x1 >= x2) {
    		aux = x1;
    	}else {
    		aux = x2;
    	}
    	
		while(c < aux) {
			currentx1 = currentx1 + v1;
			currentx2 = currentx2 + v2;
			if(currentx1 == currentx2) {
				res = "YES";
				break;
			}
			c++;
		}
    	
    	return res;
    }
}