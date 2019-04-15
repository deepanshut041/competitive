package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutoLoan {


    private static double interestRate(double price, double monthlyPayment, int loanTerm) {
        double u = 100.0;
        double l = 0.0;
        double mid = 0;
        while (Math.abs(u - l) / u > 1e-9) {
            mid = l + (u - l) / 2.0;
            double amount = calculateAmount(mid, price, monthlyPayment, loanTerm);
            if (amount == 0.00)
                break;
            else if (amount < 0)
                l = mid;
            else
                u = mid;
        }

        return mid * 12 *100;
    }

    private static double calculateAmount(double rate, double price, double monthlyPayment, int loanTerm) {
        for (int i = 0; i < loanTerm; i++) {
            price = price  + (rate * price) - monthlyPayment;
        }
        return price;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double price = Double.parseDouble(br.readLine());
        double monthlyPayment = Double.parseDouble(br.readLine());
        int loanTerm = Integer.parseInt(br.readLine());
        System.out.println(interestRate(price, monthlyPayment, loanTerm));
    }
}
