public class FindMinMax {
    public static void getMinMax(int[] arr) {
        if (arr == null || arr.length == 0) return;
        
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum: " + min + ", Maximum: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {12, 1234, 45, 67, 1};
        getMinMax(arr);
    }
}