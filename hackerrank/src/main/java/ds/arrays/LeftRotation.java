package ds.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LeftRotation {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] cns = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        LeftRotationSolver solver = new LeftRotationSolver();
        solver.rotate(arr, cns[1]);
    }
}

class LeftRotationSolver{
    int[] rotate(int[] arr, int r){
        r = r % ( arr.length );
        for(int i = r; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < r; i++){
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}