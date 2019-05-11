package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lis {

    private static int maxRef;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        maxRef = 1;
        System.out.println("Length of lis is " + lis(arr, arr.length));
    }

    private static int lis(int[] arr, int n) {
        if(n == 1)
            return n;
        int res, maxRefHere =1;
        for (int i = 1; i < n; i++) {
            res = lis(arr, i);
            if(arr[i - 1] < arr[n - 1] && res + 1 > maxRefHere)
                maxRefHere = res + 1;
        }

        if(maxRef < maxRefHere)
            maxRef = maxRefHere;

        return maxRefHere;
    }
}
