package ds.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Array2D {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++){
            arr[i] = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays2DSolver solver = new Arrays2DSolver();
        System.out.println(solver.hourglassSum(arr));

    }
}

class Arrays2DSolver{
    public int hourglassSum(int[][] arr) {
        int max = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
