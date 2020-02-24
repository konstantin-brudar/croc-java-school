/**
 * Task #1
 *
 * An array of integers is given.
 * This class has a method that moves the first minimum number to the beginning of array, and the first maximum one to the end.
 *
 * @author Konstantin Brudar
 * @version 1.0
 */
public class Task_1 {
    public static void main(String[] args) {
        int[] v = new int[]{3,5,2,1,1,4};

        moveMinMaxElements(v);

        for (int elem : v) {
            System.out.println(elem);
        }
    }

    /**
     * Move min and max values in array to the beginning and the end of array respectively.
     *
     * @param array array of integers.
     */
    public static void moveMinMaxElements(int[] array) {
        moveMin(array);
        moveMax(array);
    }

    /**
     * Move min value in array to the beginning of array.
     *
     * @param array array of integers.
     */
    private static void moveMin(int[] array) {
        int indexMin = minIndex(array);
        if (indexMin != -1) {
            moveElement(array, indexMin, 0);
        }
    }

    /**
     * Move max value in array to the end of array.
     *
     * @param array array of integers.
     */
    private static void moveMax(int[] array) {
        int indexMax = maxIndex(array);
        if (indexMax != -1) {
            moveElement(array, indexMax, array.length - 1);
        }
    }

    /**
     * Find index of minimum number in array.
     *
     * @param   array array of integers.
     * @return  index of minimum value in array.
     */
    private static int minIndex(int[] array) {
        if (isArrayEmpty(array)) {
            return -1;
        }
        int indexMin = 0;
        int min = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    /**
     * Find index of maximum number in array.
     *
     * @param   array array of integers.
     * @return  index of maximum value in array.
     */
    private static int maxIndex(int[] array) {
        if (isArrayEmpty(array)) {
            return -1;
        }
        int indexMax = 0;
        int max = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    /**
     * Move element with index {@code indexFrom} to index {@code indexTo} in array {@code array}.
     * Elements with index between {@code indexFrom} and {@code indexTo} are shifted accordingly.
     *
     * @param   array       array of integers with length >= 2.
     * @param   indexFrom   source index of element to be moved (>= 0 and < array.length).
     * @param   indexTo     destination index of element we are moving (>= 0 and < array.length).
     */
    private static void moveElement(int[] array, int indexFrom, int indexTo) {
        if (indexFrom <= indexTo) {
            int tmp = array[indexFrom];
            for (int i = indexFrom; i < indexTo; ++i) {
                array[i] = array[i + 1];
            }
            array[indexTo] = tmp;
        } else {
            int tmp = array[indexFrom];
            for (int i = indexFrom; i > indexTo; --i) {
                array[i] = array[i - 1];
            }
            array[indexTo] = tmp;
        }
    }

    /**
     * Check if array is empty or not.
     *
     * @param   array   array of integers.
     * @return  true if array is empty, false otherwise.
     */
    private static boolean isArrayEmpty(int[] array) {
        return array == null || array.length == 0;
    }
}
