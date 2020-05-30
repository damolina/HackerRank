package com.dmolina.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dmolina.util.Util;

public class GradingStudents {

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>();
		List<Integer> listGrades = Arrays.asList(98,100);
		
		grades.addAll(listGrades);

		Util.printArrayList(grades);
		
		List<Integer> result = gradingStudents(grades);
		
		Util.printArrayList(result);
	}
	
    public static List<Integer> gradingStudents(List<Integer> grades) {
    	List<Integer> finalGrades = new ArrayList<Integer>();
    	finalGrades.addAll(grades);
    	int multFound = 0;
    	int[] mult5 = {40,45,50,55,60,65,70,75,80,85,90,95,100};
    	
    	for(int i=0;i<grades.size();i++) {
    		for(int j=0;j<mult5.length;j++) {
    			if(grades.get(i)>= 38 && grades.get(i)<mult5[j]) {
    				multFound = mult5[j];
    				if((mult5[j] - grades.get(i)) < 3) {
    					finalGrades.set(i,mult5[j]);
    				}
    				break;
    			}
    		}

    	}
    	return finalGrades;
    }

}