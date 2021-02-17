
// My code :
import java.io.*;
import java.util.*;

public class reverseArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a) {
        int start = 0;
        int end = a.length - 1;
        int temp;
        while (start < end) {
            temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }

}
// Concept :
// 2 pointer approach. Remember to use 'left' and 'right' pointer names
