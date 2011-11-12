package ca.pjones.app;

import ca.pjones.ciphernator.*;

public enum CipherTypes {
	Reverser, 
	CaeserShifter;
	
	public static CipherTypes find(int index) {
		return values()[index];
	}
	
	public void getDescription() {
		switch(this) {
		case Reverser:
			System.out.println("The reverser, simply reverses text");
			break;
		case CaeserShifter:
			System.out.println("This is the CaeserShift algorithm.\n It has a default of 3");
			break;
		default:
			System.out.println("Not implemented yet. Sorry.");
		}
	}
}
