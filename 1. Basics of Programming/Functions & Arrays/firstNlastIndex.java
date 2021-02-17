import java.io.*;
import java.util.*;

public class firstNlastIndex {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        int d = sc.nextInt();
        int start = 0;
        int end = n1;
        int r_end = -1, l_end = -1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] < d) {
                start = mid + 1;
            } else if (a[mid] > d) {
                end = mid - 1;
            } else {
                start = mid + 1; // Going deeper to find possibility of the same value
                r_end = mid; // Storing potential answer
            }
        }
        start = 0;
        end = n1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] < d) {
                start = mid + 1;
            } else if (a[mid] > d) {
                end = mid - 1;
            } else {
                end = mid - 1;
                l_end = mid;
            }
        }
        System.out.println(l_end);
        System.out.println(r_end);
    }

}
// Concept:
// Use 1st binary search to locate head
// Use 2nd binary search to locate tail.
