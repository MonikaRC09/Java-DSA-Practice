import java.util.Scanner;

public class LinearSearchToyWarehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of toys in the warehouse
        int n = sc.nextInt();
        
        int[] toyIDs = new int[n];
        for (int i = 0; i < n; i++) {
            toyIDs[i] = sc.nextInt();
        }
        
        // Popular toy ID to find
        int targetToyID = sc.nextInt();
        boolean found = false;
        
        // write your code here
        for(int i = 0; i < toyIDs.length; i++){
            if(toyIDs[i] == targetToyID){
                System.out.println("Toy found at position: " + (i+1));
                found = true;
                break;
            }else{
                found = false;
            }
        }
        if(found == false){
            System.out.println("Toy not found" );
        }
    }
}