import java.util.Scanner;

public class RotateArrayLeft {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();

        k = k % n;

        int[] result = new int[n];

        int index = 0;

        for (int i = k; i < n; i++) {
            result[index++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            result[index++] = arr[i];
        }

        System.out.println("Array after left rotation:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}