package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    private static int[] mLookup;
    private static int[] tLookup;

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        mLookup = new int[n + 1];
        tLookup = new int[n + 1];
        System.out.println("Recursive Fib:" + rFib(n));
    }

    private static int tFib(int n) {
        tLookup[1] = 1;
        for (int i = 2; i <= n ; i++) {
            tLookup[i] = tLookup[i - 1] + tLookup[i - 2];
        }
        return tLookup[n];
    }

    private static int mFib(int n) {
        if(mLookup[n] == 0){
            if(n <= 1)
                mLookup[n] = n;
            else
                mLookup[n] = mFib(n - 1) + mFib(n - 2);
        }
        return mLookup[n];
    }

    private static int rFib(int n) {
        if(n <= 1)
            return n;
        return rFib(n - 1) + rFib(n - 2);

    }
}
