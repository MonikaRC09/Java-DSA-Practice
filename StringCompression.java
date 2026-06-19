/*
Problem: String Compression
Approach: Two Pointers and Character Counting
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;

public class StringCompression {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        char[] chars = new char[n];

        for (int i = 0; i < n; i++) {
            chars[i] = scanner.next().charAt(0);
        }

        System.out.println(compress(chars));

        scanner.close();
    }

    public static int compress(char[] chars) {

        int i = 0;
        int index = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[index++] = current;

            if (count > 1) {
                String str = String.valueOf(count);

                for (int j = 0; j < str.length(); j++) {
                    chars[index++] = str.charAt(j);
                }
            }
        }

        return index;
    }
}