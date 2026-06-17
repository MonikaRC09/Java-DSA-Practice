/*
Problem: Valid Palindrome
Approach: Two Pointers
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

