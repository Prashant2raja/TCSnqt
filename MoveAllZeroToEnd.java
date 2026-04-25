package TCSnqt;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeroToEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("Enter Elements");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
