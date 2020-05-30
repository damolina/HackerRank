package com.dmolina.pruebas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingAQueue {

	public static void main(String[] args) {
		Queue<Integer> listado 	= new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		listado.add(1);
		listado.add(2);
		listado.add(3);
		listado.add(4);
		listado.add(5);
		
		System.out.println("Original");
		System.out.println(listado);
		
		while(!listado.isEmpty()) {
			stack.push(listado.remove());
		}
		
		System.out.println("Reverso");
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}	

	}
}
