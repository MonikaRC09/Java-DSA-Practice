/*
Problem: Find Maximum and Minimum Element in Array
Description: Java program to find the largest and smallest element in an integer array
Approach: Linear traversal of array
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ArrayMaxMin {

    public static void main(String[] args) {

        int[] arr = {3, 4, 6, 2, 7, 8};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}