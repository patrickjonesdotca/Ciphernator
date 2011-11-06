package ca.pjones.ciphernator;

public abstract class Ciphernator {
  
  public String inputString;
  public String outputString;
  
  abstract public void encryptString();
  abstract public void decryptString();
  
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
}
