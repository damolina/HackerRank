package com.dmolina.pruebas;

import java.util.Hashtable;

public class TwoStrings {
	
    static String twoStrings(String s1, String s2) {
    	String[] list_s1 = s1.split("");
    	String[] list_s2 = s2.split("");
    	String res = "NO";
    	int cant = 0;
    	
    	Hashtable<String,Integer> listado = new Hashtable<String,Integer>();
    	for(int i=0;i<list_s2.length;i++){
    		if(!listado.containsKey(list_s2[i])){	
    			listado.put(list_s2[i],1);
    		}else{
    			listado.replace(list_s2[i],listado.get(list_s2[i])+1);
    		}
    	}
    	
    	for(int i=0;i<list_s1.length;i++) {
    		if(listado.containsKey(list_s1[i])) {
    			cant++;
    		}
    	}
    	if(cant > 0) {
    		res = "YES";
    	}
    	return res;
    }


	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "world";
		String result = twoStrings(s1, s2);
		System.out.println(result);
	}

}
