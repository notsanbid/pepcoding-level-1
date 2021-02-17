
// My solution : 
import java.io.*;
import java.util.*;

public class ceilFloorArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int req = sc.nextInt();
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] < req) {
                start = mid + 1;
            } else if (a[mid] > req) {
                end = mid - 1;
            } else if (a[mid] == req) {
                start = mid;
                end = mid;
                break;

            }
        }

        System.out.println(a[start]);
        System.out.println(a[end]);
    }
}

// Concept :
// Use binary search
// If number found or not, print the left(start) and right(end) at high and low
// respectively
