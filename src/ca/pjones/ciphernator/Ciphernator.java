package ca.pjones.ciphernator;

public class Ciphernator implements Cipherable {
  
  public String inputString;
  public String outputString;
  
  public void setInputString(String string)
  {
    inputString = string;
  }
  
  public String getInputString()
  {
    return inputString;
  }
  
  public String getEncryptedString()
  {
    return outputString;
  }
  
  public int charToAscii(char c)
  {
    return (int)c;
  }
  
  public char asciiToChar(int i)
  {
    return (char)i;
  }
  public void encryptString()
  { 
  }
  
  public void decryptString()
  {
  }
}
