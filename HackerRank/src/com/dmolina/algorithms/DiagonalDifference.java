package com.dmolina.algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		List<Integer> a1 = Arrays.asList(11, 2, 4);
		List<Integer> a2 = Arrays.asList(4, 5, 6);
		List<Integer> a3 = Arrays.asList(10, 8, -12);
		
		List<List<Integer>> arr = new ArrayList<>();
		arr.add(a1);
		arr.add(a2);
		arr.add(a3);

		int res = diagonalDifference(arr);
		System.out.println("res: " + res);
	}
	
    public static int diagonalDifference(List<List<Integer>> arr) {
    	int a = 0;
    	int b = 0;
    	int len = arr.size() - 1;
    	
    	for(int i=0; i< arr.size();i++) {
    		a = a + arr.get(i).get(i); 
    		b = b + arr.get(i).get(len);
    		len--;
    	}
    	return Math.abs(a - b);
    }
}
