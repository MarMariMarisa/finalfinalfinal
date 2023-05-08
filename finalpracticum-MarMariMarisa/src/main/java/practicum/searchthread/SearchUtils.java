package practicum.searchthread;

import java.util.HashSet;
import java.util.Random;

/**
 * A class that provides utility functions useful for testing search 
 * algorithms.
 */
public class SearchUtils {
    /**
     * A specific target value that can be used to test searching algorithms.
     */
    public static long TARGET_VALUE = 0xC0DE;
    
    /**
     * Creates and returns a long array with n unique random values in it. The
     * array is guaranteed to including the TARGET_VALUE.
     * 
     * @param n The size of the array to return.
     * 
     * @return A long array with n unique values including the TARGET_VALUE.
     */
    public static long[] randomArray(int n) {
        return randomArray(n, TARGET_VALUE);
    }

    /**
     * Creates and returns a long array with n unique random values in it. The
     * array is guaranteed to include a specified target value.
     * 
     * @param n The size of the array to return.
     * @param targetValue The target value; guaranteed to be in the array that
     * is returned.
     * 
     * @return A long array with n unique values including the target value.
     */
    public static long[] randomArray(int n, long targetValue) {
        Random RNG = new Random(1234);

        // use a set to generate unique random values
        HashSet<Long> values = new HashSet<>();
        values.add(targetValue);
        while(values.size() < (n)) {
            values.add(RNG.nextLong());
        }

        // copy the values into an array
        long[] array = new long[n];
        int index = 0;
        for(long value : values) {
            array[index++] = value;
        }

        // shuffle the array
        for(int i=0; i<array.length; i++) {
            int j = RNG.nextInt(i, array.length);
            if(i != j) {
                long tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }

        return array;
    }
}
