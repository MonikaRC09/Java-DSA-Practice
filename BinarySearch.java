import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the key to be searched");
		int key = sc.nextInt();
		binarySearch(arr, key);
		
		
	}
	
	public static void binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length-1;
		
			
			while(left <= right) {
				int mid = (left + right)/2;
				if(key == arr[mid]) {
					System.out.println("key found");
					return;
				}else if(key < arr[mid]) {
					right = mid - 1; 
				}else {
					left = mid +1;
				}
			}
			
			System.out.println("Key not found");
		
	}

}
