import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // Number of months of data
        int n = sc.nextInt();
        
        // Array to store rainfall data
        int[] rainfall = new int[n];
        for (int i = 0; i < n; i++) {
            rainfall[i] = sc.nextInt();
        }
        
        // Write your code here to sort the rainfall data using Bubble Sort
        descendingSort(rainfall);
        for(int i=0; i<rainfall.length; i++){
            System.out.print(rainfall[i] + " ");
        }
    }
	public static void descendingSort(int rainfall[]) {
		for(int i=0; i<=rainfall.length-2; i++){
			for(int j=0; j<=rainfall.length-2-i; j++){
				if(rainfall[j] < rainfall[j+1]){
					int temp = rainfall[j];
                    rainfall[j] = rainfall[j+1];
                    rainfall[j+1] = temp;
                }
            }
        }
	}
}
