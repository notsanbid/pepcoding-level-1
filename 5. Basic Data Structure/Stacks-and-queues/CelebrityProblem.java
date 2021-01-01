import java.io.*;
import java.util.*;

public class CelebrityProblem {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++)
            st.push(i);
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (arr[a][b] == 0 && arr[b][a] == 1)
                st.push(a);
            if (arr[a][b] == 1 && arr[b][a] == 0)
                st.push(b);
        }
        if (st.size() == 1) {
            int prob = st.pop();
            for (int i = 0; i < arr.length; i++) {
                if (i != prob) {
                    if (arr[i][prob] == 1 && arr[prob][i] == 0) {
                        continue;
                    } else {
                        System.out.println("none");
                        return;
                    }
                }
            }
            System.out.println(prob);
        } else
            System.out.println("none");
    }

}