
// Given Solution :
import java.io.*;
import java.util.*;

public class differenceOfTwoArrays {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = Integer.parseInt(br.readLine());
        }

        int n2 = Integer.parseInt(br.readLine());
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = Integer.parseInt(br.readLine());
        }

        int[] diff = new int[n2];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = diff.length - 1;
        int c = 0;
        while (k >= 0) {
            int v;

            if (i >= 0) {
                v = a1[i];
            } else {
                v = 0;
            }

            if (a2[j] + c >= v) {
                diff[k] = a2[j] + c - v;
                c = 0;
            } else {
                diff[k] = a2[j] + c + 10 - v;
                c = -1;
            }

            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] != 0) {
                break;
            } else {
                idx++;
            }
        }

        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
    }

}

// Concept :
// In case of a1 < a2:
// Ternary Operator of if-else to handle the values that exceed 'i', if i is out
// of range
// name a1[i] as zero
// In case of Preceeding zeros :
// An idx pointer keeps increasing from zero to first non zero element in one
// iteration
// In next iteration, printing starts from there

// My Solution (Probably better one):

// int n = n1>n2?n1:n2;
// int c[] = new int[n];

// int i = n1-1;
// int j = n2-1;
// int k = n-1;
// int bo = 0;

// while(k>=0){
// int d = bo;
// if(j >= 0)
// d += b[j];
// if(i >= 0)
// d -= a[i];
// if(d < 0){
// d = d + 10;
// bo = -1;
// }
// else
// bo = 0;
// c[k] = d;
// i--;
// j--;
// k--;
// }
// int start = 0;
// for(i=0;i<n;i++)
// if(c[i]==0)
// continue;
// else{
// start = i;
// break;
// }
// for(i=start;i<n;i++)
// System.out.println(c[i]);
// }
// }