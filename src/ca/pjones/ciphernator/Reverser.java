package ca.pjones.ciphernator;

public class Reverser extends Ciphernator
{
  public void encryptString()
  {
    outputString = new StringBuffer(inputString).reverse().toString();    
  }
  
  public void decryptString()
  {
    encryptString();
  }
}
