/*
Problem: Largest Word In A String
Approach: Split String and Compare Lengths
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class LargestWordInAString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        String largest = "";

        for(String word : words) {
            if(word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Largest Word: " + largest);
    }
}