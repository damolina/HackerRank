package com.dmolina.comparator;

import java.util.Arrays;

public class Solution {
	
	private static void imprimirListado(Player[] players) {
		for(int i= 0;i< players.length;i++) {
			System.out.println("Nombre: " + players[i].getName() + " - score: " + players[i].getScore());
		}
	}

	public static void main(String[] args) {
		int n = 3;
		Player[] player = new Player[n];
		
		player[0] = new Player("Smith",20);
		player[1] = new Player("Jones",15);
		player[2] = new Player("Jones",20);
	
		System.out.println("Listado original: ");
		imprimirListado(player);
		
		Arrays.sort(player,new Checker());
		
		System.out.println(" ");
		System.out.println("Listado reordenado: ");
		imprimirListado(player);

	}

}
