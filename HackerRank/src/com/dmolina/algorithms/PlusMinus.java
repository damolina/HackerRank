//15 min
package com.dmolina.algorithms;

public class PlusMinus {

	public static void main(String[] args) {
		int[] arr = {-4,3,-9,0,4,1};
		
		plusMinus(arr);

	}
	
    static void plusMinus(int[] arr) {
    	double positive = 0;
    	double negative = 0;
    	double zero = 0;
    	
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] > 0) {
    			positive++;
    		}else if(arr[i] < 0) {
    			negative++;
    		}else{
    			zero++;
    		}
    	}
    	System.out.println(String.format("%.5g",positive/arr.length));
    	System.out.println(String.format("%.5g",negative/arr.length));
    	System.out.println(String.format("%.5g",zero/arr.length));
    }

}
