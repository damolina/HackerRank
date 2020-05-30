package com.dmolina.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.dmolina.util.Util;

public class CompareTheTriplets {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(6);
		a.add(7);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(6);
		b.add(10);
		
		List<Integer> result = compareTriplets(a, b);
		
		Util.printArrayList(result);
	
	}
	
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(0);
    	list.add(0);
    	
    	for(int i=0;i<a.size();i++) {
    		if(a.get(i) > b.get(i)) {
    			list.set(0, list.get(0) + 1);
    		}else if(a.get(i) < b.get(i)) {
    			list.set(1, list.get(1) + 1);
    		}
    	}
    	return list;
    }

}
