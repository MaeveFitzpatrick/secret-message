package secretMessage;

public class caesar{
/*********************************************************************
 * CaesarEncode implements the Caesar cipher encoding scheme.        *
 *                                                                   * 
 * Receive: ch, a character.                                         *
 *          key, the amount by which to rotate ch.                   *
 * Return:  The character that is key positions after ch,            *
 *          with "wrap-around" to the beginning of the sequence.     *
 *********************************************************************/

public char CaesarEncode(char ch, int key)
{
  int FIRST_UPPER = 65,
            FIRST_LOWER = 97,
            NUM_CHARS = 26;
  int chvalue = ch;
  int keyvalue = key;
  int encodechar;


  if (key <= 0 || key >= NUM_CHARS){
      System.out.println("\n CaesarEncode: key must be between 1 and 25\n");
    return Character.MIN_VALUE;
    }
  if (Character.isUpperCase(ch)){
    encodechar = (chvalue - FIRST_UPPER + keyvalue) % NUM_CHARS + FIRST_UPPER;
    return (char)encodechar;
    }
  else if (Character.isLowerCase(ch)) {
    encodechar = (chvalue - FIRST_LOWER + keyvalue) % NUM_CHARS + FIRST_LOWER;
    return (char)encodechar;
    }
  else
    return ch;
  }
/********************************************************************
 * CaesarDecode implements the Caesar cipher encoding scheme.       *
 *                                                                  * 
 * Receive: ch, a character,                                        *
 *          key, an integer.                                        *
 * Return:  The character that is key positions before ch,          *
 *          with "wrap-around" to the end of the sequence.          *
 ********************************************************************/


public char CaesarDecode(char ch, int key)
{
  int FIRST_UPPER = 65,
            FIRST_LOWER = 97,
            NUM_CHARS = 26;
  int chvalue = ch;
  int keyvalue = key;
  int decodechar;
  
  if (key <= 0 || key >= 26)
  {
     System.out.println("\n CaesarDecode: key must be between 1 and 25!\n");
     return Character.MIN_VALUE;
  }

  if (Character.isUpperCase(ch)) {
    decodechar = (ch - FIRST_UPPER + NUM_CHARS - key) % NUM_CHARS + FIRST_UPPER;
    return (char)decodechar;
    }
  else if (Character.isLowerCase(ch)) {
    decodechar = (ch - FIRST_LOWER + NUM_CHARS - key) % NUM_CHARS + FIRST_LOWER;
    return (char)decodechar;
    }
  else
    return ch;
}


  
}