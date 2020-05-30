package com.dmolina.pruebas;

import java.util.Hashtable;

public class RansomNote {
	
    static void checkMagazine(String[] magazine, String[] note) {
    	int c = note.length;
    	int n = 0;
    	String res = "No";
    	Hashtable<String,Integer> lis = new Hashtable<String,Integer>();
    	
    	for(int j=0;j<magazine.length;j++) {
    		if(!lis.containsKey(magazine[j])) {
    			lis.put(magazine[j],1);
    		}else {
    			lis.replace(magazine[j], lis.get(magazine[j])+1);
    		}
    	}
    	
    	for(int i=0;i<note.length;i++) {
    		if(lis.containsKey(note[i]) && lis.get(note[i]) > 0) {
    				n++;
    				lis.replace(note[i], lis.get(note[i])-1);
    		}
    		
        	if(n == c) {
        		res = "Yes";
        	}
    	}

    	System.out.println(res);
    }

	public static void main(String[] args) {
		int n = 6;
		int m = 5;
		String[] magazine = new String[n];
		String[] note = new String[m];
		
		magazine[0] = "two";
		magazine[1] = "times";
		magazine[2] = "three";
		magazine[3] = "is";
		magazine[4] = "not";
		magazine[5] = "four";
		
		note[0] = "two";
		note[1] = "times";
		note[2] = "two";
		note[3] = "is";
		note[4] = "four";

		checkMagazine(magazine, note);
	}

}
