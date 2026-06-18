import java.util.*;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = twoSum(arr, target);

        if(result != null){
            System.out.println("[" + result[0] + ", " + result[1]+ "]");
        }else{
            System.out.println("No soltion found.");
        }
        
    }

    public static int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int currentSum = arr[left] + arr[right];

            if(currentSum == target){
                return new int[]{left + 1, right + 1};
            }else if(currentSum < target){
                left++;
            }else{
                right--;
            }
        }
        return null;
    }
}

