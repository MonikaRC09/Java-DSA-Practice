/*
Problem: Find Duplicate Characters In String
Approach: LinkedHashMap Frequency Counting
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharactersInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()) {
            if(ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}