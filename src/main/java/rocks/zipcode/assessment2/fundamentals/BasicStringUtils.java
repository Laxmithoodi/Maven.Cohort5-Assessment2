package rocks.zipcode.assessment2.fundamentals;

import java.util.HashMap;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1+string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {

        String reversed = "";

        for (int i = string1.length() - 1; i >= 0; i--) {
            reversed += string1.charAt(i);
        }

        return reversed;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {

        String reversed1= "";

        for (int i = string1.length() - 1; i >= 0; i--) {
            reversed1 += string1.charAt(i);
        }

      //  return reversed1;


        String reversed2= "";

        for (int i = string2.length() - 1; i >= 0; i--) {
            reversed2 += string2.charAt(i);
        }

       // return reversed1;
        return reversed1+ reversed2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

        StringBuilder sb = new StringBuilder(string);
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();

        for (int i = 0; i < charactersToRemove.length(); i++)
        {
            table.put(charactersToRemove.charAt(i), 1);

        }
        int p = 0;
        for (int i = 0; i < string.length(); i++)
        {

            if (table.containsKey(string.charAt(i)))
            {
                if (p == 0)
                {
                    sb.deleteCharAt(i);
                    //p++;
                }
                else
                {
                    sb.deleteCharAt(i - p);
                }


                p++;
            }

        }

        return sb.toString();
    }


    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {

        String s = removeCharacters(string, charactersToRemove);

        String newString = reverse(s);


        return newString;
    }
}
