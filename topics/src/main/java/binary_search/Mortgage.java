package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mortgage {
    private static int monthlyPayment(int loan, int interest, int term) {
        int u = loan;
        int l = 0;
        int mid = 0;
        while (u >= l) {
            mid = l + Math.abs(u - l) / 2;
            double amount = calculateAmount((double) interest / 12000, loan, mid, term * 12);
            if (Math.abs(amount) < mid )
                break;
            else if (amount > 0)
                l = mid;
            else
                u = mid;
        }

        return mid;
    }

    private static double calculateAmount(double rate, double price, double monthlyPayment, int loanTerm) {
        for (int i = 0; i < loanTerm; i++) {
            price = price  + (rate * price) - monthlyPayment;
        }
        return price;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int intrest = Integer.parseInt(br.readLine());
        int loanTerm = Integer.parseInt(br.readLine());
        System.out.println(monthlyPayment(price, intrest, loanTerm));
    }
}
