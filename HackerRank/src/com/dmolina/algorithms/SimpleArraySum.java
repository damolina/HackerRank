// 17 minutes
package com.dmolina.algorithms;

public class SimpleArraySum {

	public static void main(String[] args) {
		int[] arr = {1,3,4,7,8};
		int sum = simpleArraySum(arr);
		System.out.println("sum: " + sum);

	}
	
    static int simpleArraySum(int[] ar) {
    	int sum = 0;
    	for(int i=0; i<ar.length;i++) {
    		sum = sum + ar[i];
    	}
    	return sum;
    }

}
