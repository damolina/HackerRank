package com.dmolina.algorithms;

import java.util.Arrays;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		int[] ar = {3,2,1,3};
		int res = birthdayCakeCandles(ar);
		System.out.println(res);

	}
	
    static int birthdayCakeCandles(int[] ar) {
    	int max = 0; 
    	int q = 0;
    	int currentMax = 0;
    	
    	Arrays.parallelSort(ar);
    	
    	for(int i=0;i<ar.length;i++) {
    		if(ar[i]>=max) {
    			max = ar[i];
    			if(max != currentMax) {
					q=0;
				}else {
					q++;
				}
    			if(q==0) {	
    				q++;
    			}	
    			currentMax = max;
    		}
    	}

    	return q;
    }

}
