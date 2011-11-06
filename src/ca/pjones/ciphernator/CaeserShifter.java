package ca.pjones.ciphernator;

enum Direction {UP, DOWN};

class CaeserShifter extends Ciphernator
{
  private int SHIFT_VALUE;
  static final int SET_START = 48;
  static final int SET_END = 122;
  StringBuffer sb;
  
  public CaeserShifter(int shiftValue)
  {
    this.SHIFT_VALUE = shiftValue;
  }
  
  public CaeserShifter()
  {
    int SHIFT_VALUE = 3;
  }
  
  public void encryptString()
  {
    sb = new StringBuffer();
    for(int i = 0; i < inputString.length(); i++) {
      int c = charToAscii(inputString.charAt(i));
      int crypted = shift(c, Direction.UP);
      char asciified = asciiToChar(crypted);
      sb.append(asciified);
    }
    outputString = sb.toString();
  }
  
  
  public void decryptString()
  {
    for(int i = 0; i < inputString.length(); i++) {
      int c = charToAscii(inputString.charAt(i));
      int crypted = shift(c, Direction.DOWN);
      char asciified = asciiToChar(crypted);
      sb.append(asciified);}
    outputString = sb.toString();
  }
  
  private int shift(int value, Direction shift)
  {
    int ret = 0;
    switch(shift)
    {
      case UP: 
        ret =  value + SHIFT_VALUE;
        if(ret > SET_END) ret = (SET_START + (ret - SET_END));
        break;
      case DOWN:
        ret =  value - SHIFT_VALUE; 
        if(ret < SET_START) ret = (SET_END - (SET_START - ret));
        break;
      default:
        System.out.println("you goofed up");
        return 0;
    }    
    return ret;
  }
  
  
}