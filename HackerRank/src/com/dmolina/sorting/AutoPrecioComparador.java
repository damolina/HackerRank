package com.dmolina.sorting;

import java.util.Comparator;

public class AutoPrecioComparador implements Comparator<Auto> {

	@Override
	public int compare(Auto a1, Auto a2) {
		return a1.precio - a2.precio;
	}

}
