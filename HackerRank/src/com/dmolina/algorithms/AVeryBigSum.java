package com.dmolina.algorithms;

public class AVeryBigSum {

	public static void main(String[] args) {
		long[] ar = {1000000001,1000000002,1000000003,1000000004,1000000005};
		
		long result = aVeryBigSum(ar);
		
		System.out.println(result);

	}
	
    static long aVeryBigSum(long[] ar) {
    	long result = 0;
    	
    	for(int i=0;i<ar.length;i++) {
    		result = result + ar[i];
    	}
    	return result;
    }

}
