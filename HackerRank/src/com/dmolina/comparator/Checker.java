package com.dmolina.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
	
	// ok, pero se puede hacer directamente con la funcion compareTo
	/*
	public static int compareString(String a, String b) {
		int l1 = a.length();
		int l2 = b.length();
		int lmin = Math.min(l1,l2);
		
		for(int i=0; i<lmin;i++) {
			int c1 = a.charAt(i);
			int c2 = b.charAt(i);
			
			if(c1 != c2) {
				return c1 - c2;
			}
		}
		
		if(l1 != l2) {
			return l1 - l2;
		}else {
			return 0;
		}
	}
	*/

	@Override
	public int compare(Player a, Player b) {		
		
		if(b.getScore() == a.getScore()) {
			//return compareString(a.getName(),b.getName());
			return a.getName().compareTo(b.getName());
		}
		return b.getScore() - a.getScore();
	}
}
