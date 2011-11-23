package ca.pjones.ciphernator;

public enum CipherTypes {
	 Reverser, CaeserShifter;
	 

	 public static CipherTypes find(int index) {
	  return values()[index];
	 }
	 
	 public Ciphernator build() {
	   Ciphernator cr = null;
	   switch(this) {
	     case Reverser:
	       cr =  new Reverser();
	       break;
	     case CaeserShifter:
	       cr =  new CaeserShifter();
	       break;
	   }
	   return cr;
	 }
	 
}


