package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FairWorkload {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cabinet = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int workers = Integer.parseInt(br.readLine());
        int a = getMostWork(cabinet, workers);
        System.out.println(a);

    }

    private static int getMostWork(int[] cabinet, int workers) {
        int maxLoad = Arrays.stream(cabinet).sum();
        int u = cabinet.length;
        int l = 0;
        int m = 0;

        while (u > l){

        }

        return 0;
    }
}
