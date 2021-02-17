import java.io.*;
import java.util.*;

public class subarray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int k = 0; k < n; k++) {
            for (int i = k; i < n; i++) {
                for (int j = k; j <= i; j++)
                    System.out.print(arr[j] + "	");
                System.out.println();
            }
        }
    }

}