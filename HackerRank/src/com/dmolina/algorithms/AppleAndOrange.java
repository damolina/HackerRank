package com.dmolina.algorithms;

public class AppleAndOrange {

	public static void main(String[] args) {
		int s = 7;
		int t = 11;
		int a = 5;
		int b = 15;
		int[] apples  = {-2,2,1};
		int[] oranges = {5,-6,2};

		countApplesAndOranges(s, t, a, b, apples, oranges);
	}
	
	
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	long appleIn 	= 0;
    	long orangeIn	= 0;

    	for(int i=0;i<apples.length;i++) {
    		if((a + apples[i] >= s) &&  (a + apples[i] <= t)) {
    			appleIn++;
    		}
    	}
    	
    	for(int i=0;i<oranges.length;i++) {
    		if((b + oranges[i] >= s) &&  (b + oranges[i] <= t)) {
    			orangeIn++;
    		}
    	}
    	
    	System.out.println(appleIn);
    	System.out.println(orangeIn);
    }

}
