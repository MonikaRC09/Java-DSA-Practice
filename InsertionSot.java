import java.util.Scanner;

public class InsertionSot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Number of properties
        int n = sc.nextInt();
        
        // Array to store property prices
        float[] prices = new float[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextFloat();
        }
        
       insertionSort(prices);
       System.out.print("Sorted Prices: ");
       for(int i=0; i<prices.length; i++){
        System.out.printf("%.2f ", prices[i]);
       }
    }
    public static void insertionSort(float[] prices){

        for(int i=1; i<prices.length; i++){
            float key = prices[i];
            int j = i-1;
            while(j >= 0  && prices[j] > key){
                prices[j+1] = prices[j];
                j--;
            }
            prices[j+1] = key;
        }
    }
}