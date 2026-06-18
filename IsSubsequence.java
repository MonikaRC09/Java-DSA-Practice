import java.util.*;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(isSubsequence(s, t));
        scanner.close();
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(i <= s.length()-1 && j <= t.length()-1){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return (i == s.length());
    }
}