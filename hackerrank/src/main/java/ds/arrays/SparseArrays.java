package ds.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SparseArrays {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nStrings, nQueries;
        nStrings = Integer.parseInt(reader.readLine());

        String[] strings = new String[nStrings];
        for (int i = 0; i < nStrings; i++) {
            strings[i] = reader.readLine();
        }

        nQueries = Integer.parseInt(reader.readLine());

        String[] queries = new String[nQueries];
        for (int i = 0; i < nQueries; i++) {
            queries[i] = reader.readLine();
        }

        SparseArraysSolver sparseArraysSolver = new SparseArraysSolver();
        int[] res = sparseArraysSolver.matchingStrings(strings, queries);

        for(int r:res){
            System.out.println(r);
        }

    }
}

class SparseArraysSolver{

    int[] matchingStrings(String[] strings, String[] queries) {
        int res[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (String str:strings){
                if(str.equals(queries[i]))
                    count++;
            }
            res[i] = count;
        }

        return res;
    }
}
