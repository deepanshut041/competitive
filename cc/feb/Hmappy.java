
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hmappy {

    public String chef(int N, int A, int B, int K) {
        int appay = 0, che = 0, both = 0, total = 0;
        for (int i = A; i <= N; i = i + A) {
            appay = appay + 1;
        }
        for (int i = B; i <= N; i = i + B) {
            che = che + 1;
        }
        for (int i = A * B; i <= N; i = i + A * B) {
            both = both + 1;
        }
        total = appay + che - both;
        if (total >= K) {
            return "Win";
        } else {
            return "Lose";
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] outputs = new String[T];
        for (int i = 0; i < T; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Hmappy h = new Hmappy();
            outputs[i] = h.chef(array[0], array[1], array[2], array[3]);
        }

        for (String i : outputs) {
            System.out.println(i);
        }
    }
}