package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {


    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[] {"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] a = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            a[j] = arr[i];
            j++;
        }
        return a;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int newL = arr.length;
        for (int a:
             arr) {
            if (a <= 0) {
                newL--;
            }
        }
        int i = 0;
        int[] a = new int[newL];
        for (int x:
                arr) {
            if (x > 0) {
                a[i] = x;
                i++;
            }
        }
        return a;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int i = arr.length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(arr[j].length > arr[j + 1].length) {
                    int[] z = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = z;
                }
            }
        }

        for (int i = arr[0].length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(arr[0][j] > arr[0][j + 1]) {
                    int z = arr[0][j];
                    arr[0][j] = arr[0][j + 1];
                    arr[0][j + 1] = z;
                }
            }
        }

        for (int i = arr[1].length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(arr[1][j] > arr[1][j + 1]) {
                    int z = arr[1][j];
                    arr[1][j] = arr[1][j + 1];
                    arr[1][j + 1] = z;
                }
            }
        }
        return arr;
    }
}
