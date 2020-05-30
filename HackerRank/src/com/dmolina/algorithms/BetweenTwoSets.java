package com.dmolina.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		 List<Integer> a1 = Arrays.asList(2,4);
		 List<Integer> b1 = Arrays.asList(16,32,96);
		 
		 a.addAll(a1);
		 b.addAll(b1);
		
		System.out.println("RES: " + getTotalX(a, b));
	}
	
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    	int maxA = Collections.max(a);
    	int aux = maxA;
    	int countA = 0;
    	int countB = 0;
    	int finalCount = 0;
    	
    	while(maxA <= 100) {
    		
    		for(int i=0;i<a.size();i++) {
    			if(maxA%a.get(i)==0) {
    				countA++;
    			}else {
    				countA = 0;
    			}
    		}
    		
			for(int j=0;j<b.size();j++) {
				if(b.get(j)%maxA==0) {
					countB++;
				}else {
					countB = 0;
				}
			}

    		maxA = maxA + aux;  

			if(countA == a.size() && countB == b.size()) {
				finalCount++;
			}
			countA=0;
			countB=0;
    	}
    	
    	return finalCount;
    }

}
