/*
Problem: First Non-Repeating Character
Approach: LinkedHashMap for Frequency Counting
Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Character result = firstNonRepeating(str);

        if (result != null) {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }

    public static Character firstNonRepeating(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}