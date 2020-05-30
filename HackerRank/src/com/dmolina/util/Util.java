package com.dmolina.util;

import java.util.Arrays;
import java.util.List;

public class Util {
    public static void printArray(int[] arr) {
    	for(int i=0;i<arr.length;i++){
    		System.out.print(arr[i]+" ");
    	}
    }
    
    public static void printArrayList(List<Integer> list) {
    	System.out.println(Arrays.toString(list.toArray()));
    }
}
