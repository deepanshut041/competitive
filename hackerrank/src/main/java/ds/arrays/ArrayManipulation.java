package ds.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] cns = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int queries[][] = new int[cns[1]][3];
        for (int i = 0; i < cns[1]; i++) {
            queries[i] = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }

        ArrayManipulationSolver solver = new ArrayManipulationSolver();
        long ans = solver.arrayManipulation(cns[0], queries);
        System.out.println(ans);
    }
}

class ArrayManipulationSolver{
    long arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n + 1];
        for(int[] query:queries){
            arr[query[0] - 1] += query[2];
            arr[query[1]] -= query[2];
        }
        long max = arr[0];
        long estimator = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            estimator += arr[i];
            if(estimator > max){
                max = estimator;
            }
        }
        return max;
    }
}
