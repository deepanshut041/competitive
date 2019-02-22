package ds.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysDS {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(reader.readLine());
        int[] a;
        a = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        ArraysDSSolver solver = new ArraysDSSolver();


        for (int i:solver.reverseArray(a)){
            System.out.print(i + " ");
        }
    }
}
class ArraysDSSolver{
    int[] reverseArray(int[] a) {
        int l = a.length;
        for (int i = 0; i < l / 2; i++){
            int t = a[l - i - 1];
            a[l - i - 1] = a[i];
            a[i] = t;
        }

        return a;
    }
}
