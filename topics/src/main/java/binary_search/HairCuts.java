package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HairCuts {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] time = Arrays.stream(in.readLine().split(", ")).mapToInt(HairCuts::timeToInt).toArray();
        int lTime = timeToInt(in.readLine());
        System.out.println(lTime);
    }

    //  "04:40" to 1000
    private static int timeToInt(String v){
        v = v.replace("\"", "");
        String[] hm = v.split(":");
        int h = Integer.parseInt(hm[0]);
        int m = Integer.parseInt(hm[1]);
        if (h < 9)
            h += 12;
        return h * 60 + m;
    }
}
