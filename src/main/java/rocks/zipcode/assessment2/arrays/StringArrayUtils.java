package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {


        return Arrays.asList(arrayToBeSpliced).subList(startingIndex, endingIndex).toArray(new String[0]);
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String[] newArray = new String[arrayToBeSpliced.length];
        StringBuilder sb = new StringBuilder();
        sb.append(arrayToBeSpliced);
        sb.replace(startingIndex, 0, String.valueOf(newArray.length-1));


//        for(int i = startingIndex; i < newArray.length -1; i++){
//            newArray[i] = newArray[i +1];
//        }
       return new String[]{sb.toString()};


    }
}
