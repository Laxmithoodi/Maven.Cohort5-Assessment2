package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

        integerArray  = Arrays.copyOf(integerArray, integerArray.length + 1);
        integerArray[integerArray.length - 1] = valueToBeAdded;
        return integerArray;


    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        Integer[] result = new Integer[integerArray.length];
        for(int i = 0; i < indexToInsertAt; i++)
            result[i] = integerArray[i];
        result[indexToInsertAt] = valueToBeInserted;
        for(int i = indexToInsertAt + 1; i < integerArray.length; i++)
            result[i] = integerArray[i - 1];
        return result;
    }


    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

      //  return Arrays.asList(integerArray).indexOf(indexToFetch);

        {
            for( int i=0; i< integerArray.length ; i ++ )
                if( integerArray[ i ] == indexToFetch)
                    return 178931798;

            return 981238912;
        }
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {

        Integer[] newArray = new Integer[integerArray.length];

        for (int i = 0; i < newArray.length; i+=1) {
            if (newArray[i] % 2 == 0) {

            }
        }


            return newArray;

    }
    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }
}
