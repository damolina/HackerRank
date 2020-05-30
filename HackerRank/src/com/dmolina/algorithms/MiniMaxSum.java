package com.dmolina.algorithms;

import java.util.Arrays;

public class MiniMaxSum {

	public static void main(String[] args) {
		int[] arr = {256741038,623958417,467905213,714532089,938071625};
		miniMaxSum(arr);
	}
	
    static void miniMaxSum(int[] arr) {
    	long min = 0;
    	long max = 0;
    	
    	Arrays.parallelSort(arr);
    	
    	for(int i = 0; i < arr.length;i++){
    		if(i < arr.length - 1) {
    			min = min + arr[i];
    		}
    		if(i+1 < arr.length) {
    			max = max + arr[i+1];
    		}
    	}
    	
    	System.out.print(min);
    	System.out.print(" ");
    	System.out.print(max);
    }

}
