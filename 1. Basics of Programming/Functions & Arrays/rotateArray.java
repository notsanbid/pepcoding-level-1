
// Sir's Code :
import java.io.*;
import java.util.*;

public class rotateArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a, int start, int end) {
        int temp;
        while (start < end) {
            temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] a, int k) {
        if (k < 0) {
            k = (-k) % a.length;
            k = -k + a.length;
        } else
            k = k % a.length;

        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}

// Concept :

// 1st : Fix the actual number of rotations by dividing it with array length

// 2nd : divide the array into 2 parts, based on no of rotations and reverse
// each.
// : then join both and rotate them whole