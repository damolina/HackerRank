package com.dmolina.sorting;

import java.util.Comparator;

public class AutoMaxVelComparador implements Comparator<Auto>{

	@Override
	public int compare(Auto a1, Auto a2) {
		return a1.getMaxVelocidad() - a2.getMaxVelocidad();
	}

}
