// Created by plusminus on 10:20:06 - 04.02.2009
package org.androad.sys.serverdowntime.adt;


public enum Period {
	// ===========================================================
	// Elements
	// ===========================================================

	ONCE("once"),
	DAILY("daily"),
	WEEKLY("weekly"),
	MONTHLY("monthly"),
	ANUAL("anual");

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	public final String mNAME;

	// ===========================================================
	// Constructors
	// ===========================================================

	private Period(final String aName){
		this.mNAME = aName;
	}

	public static Period fromName(final String aName){
		for(final Period p : values()) {
			if(p.mNAME.equals(aName)) {
				return p;
			}
		}

		throw new IllegalArgumentException("Downtime-Period not found: " + aName);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
