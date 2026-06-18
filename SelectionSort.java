import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Number of transactions
        int n = sc.nextInt();
        
        // Array to store transaction amounts
        float[] transactions = new float[n];
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextFloat();
        }
        System.out.print("Sorted Transactions: ");
        selectionSort(transactions);
        for(int i = 0; i < transactions.length; i++){
            System.out.print(transactions[i] + " ");
        }
        
        // Write your code here to sort the transaction amounts using Selection Sort
    }
    public static void selectionSort(float[] arr){
        for(int i = 0; i < arr.length-1; i++){
            float min = arr[i];
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            float temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}