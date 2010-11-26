// Created by plusminus on 14:54:35 - 16.05.2008
package org.androad.util;

import java.util.Comparator;


public final class LexicographicalComparator implements Comparator<String> {
	// ===========================================================
	// Final Fields
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods from SuperClass/Interfaces
	// ===========================================================

	@Override
	public int compare(final String arg0, final String arg1) {
		if(arg0 == null && arg1 == null) {
			return 0;
		}

		if(arg0 == null) {
			return 1;
		}
		if(arg1 == null) {
			return -1;
		}

		final int lenDif = arg0.length() - arg1.length();
		if (lenDif != 0) {
			return -lenDif;
		}

		return arg0.compareTo(arg1);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
