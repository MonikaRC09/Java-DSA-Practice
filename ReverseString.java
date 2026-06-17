import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = reverseStringKeepSpaces(str);
		System.out.println("Reversed String: " + result);
		sc.close();
	}
	
	public static String reverseStringKeepSpaces(String str) {
		char[] arr = str.toCharArray();
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			if(arr[left] == ' ') {
				left++;
			}else if(arr[right] == ' ') {
				right--;
			}else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left++;
				right--;
			}
		}
		
		return new String(arr);
	}

}
