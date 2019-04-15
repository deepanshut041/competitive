package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortEstimate {
    public static double howMany(int c, int time){
        double upper = 2000000000.00 / c;
        double lower = 0.0;
        double mid = 0;
        while (Math.abs(upper - lower) / upper > 1e-9){

            mid = lower + (upper - lower) / 2;
            double t = calculate(c, mid);

            if(Math.abs(time - t) < 1e-9 )
                break;
            else if (time > t)
                lower = mid;
            else
                upper = mid;
        }
        return mid;
    }

    private static double calculate(int c, double mid) {
        return c * mid * Math.log(mid) / Math.log(2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int time = Integer.parseInt(br.readLine());
        System.out.println(howMany(c, time));
    }
}
