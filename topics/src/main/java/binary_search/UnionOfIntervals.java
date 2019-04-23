package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UnionOfIntervals {
    private static int nthElement(int[] lowerBound, int[] upperBound, int n){

        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] lLimit = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] uLimit = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        System.out.println(nthElement(lLimit, uLimit, n));
    }
}
