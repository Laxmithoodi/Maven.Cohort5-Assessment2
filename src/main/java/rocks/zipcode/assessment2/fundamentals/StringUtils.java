package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            builder.append(stringToBeRepeated);
        }
        return builder.toString();
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        if (string.matches(".*[A-Za-z].*") && string.matches(string) && string.matches(".*[0-9].*") && string.matches("[A-Za-z0-9]*")){

            return true;
        }else
            return false;

    }
    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if (string.matches("[0-9]+") && string.length() > 2) {

            return true;
        }else
            return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        char c=' ';
        boolean isGood=false, safe=isGood;
        int failCount=0;
        for(int i=0;i<string.length();i++){
            c = string.charAt(i);
            if(Character.isLetter(c))
                isGood=true;
            else{
                isGood=false;
                failCount+=1;
            }
        }
        if(failCount==0 && string.length()>0)
            safe=true;
        else
            safe=false;
        return safe;
    }
}
