package com.dmolina.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
	@Override
	public int compare(Player a, Player b) {		
		
		if(b.getScore() == a.getScore()) {
			return a.getName().compareTo(b.getName());
		}
		return b.getScore() - a.getScore();
	}
}
