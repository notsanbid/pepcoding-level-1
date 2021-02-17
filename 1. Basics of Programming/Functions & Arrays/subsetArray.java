
// My Code :
import java.io.*;
import java.util.*;

public class subsetArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int num;
        String s = "";
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int max = (int) Math.pow(2, n);
        for (int i = 0; i < max; i++) {
            num = i;
            for (int j = n - 1; j >= 0; j--) {
                s = Integer.toString(num % 2) + s;
                num = num / 2;
            }
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1')
                    System.out.print(a[j] + "	");
                else
                    System.out.print("-" + "	");
            }
            System.out.println();
        }
    }

}

// Concept :

// Find 2 to the power length(n) = (max)
// Loop from 0 to max-1. In every loop repeatatively divide the loop value(n
// times) by 2 and save the remainder, thats the binary val
// Print the array according to that binary val in the loop

// Sir's code, single loops inside bigger loop:

// for(int i = 0; i < (1 << arr.length); i++){
// int dec = i;
// String str = "";

// for(int j = 0; j < arr.length; j++){
// int r = dec % 2;
// dec = dec / 2;

// if(r == 0){
// str = "-\t" + str;
// } else {
// str = arr[arr.length - 1 - j] + "\t" + str;
// }
// }

// sb.append(str + "\n");
// }
