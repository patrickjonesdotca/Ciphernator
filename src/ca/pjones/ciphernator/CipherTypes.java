package ca.pjones.ciphernator;

public enum CipherTypes {
	 Reverser, CaeserShifter;
	 

	 public static CipherTypes find(int index) {
	  return values()[index];
	 }
	 
	 public Ciphernator build() {
	   switch(this) {
	     case Reverser:
	       return new Reverser();
	   }
	   return new Ciphernator();
	 }
	 
	}


