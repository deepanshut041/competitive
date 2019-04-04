package spoj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AcMaker {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> results = new ArrayList<>();
        while (true){
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;
            String[] stopWords = new String[n];

            for (int i = 0; i < n; i++) {
                stopWords[i] = br.readLine();
            }

            boolean addQueries = true;
            while (addQueries){
                String query = br.readLine();
                if(query.equals("LAST CASE"))
                    addQueries = false;
                else
                    results.add(ACMakerSolver.abbreviationFinder(query, stopWords));
            }
        }

        for (String result: results){
            System.out.println(result);
        }
    }
}

class ACMakerSolver {
    private static String[] words;

    static String abbreviationFinder(String query, String[] stopWords) {
        words = Arrays.stream(query.split(" ")).filter(word -> {
            for (String stopWord : stopWords) {
                if (stopWord.equals(word))
                    return false;
            }
            return true;
        }).toArray(String[]::new);

        int result = finder();

//        if (result == 0) string.append(ab + " is not a valid abbreviation\n");
//        else string.append(ab + " can be formed in " + res + " ways\n");

        return "Words";
    }

    static int finder() {
        int result = 0;
        for (int i = 0; i < words.length; i++) {

        }
        return result;
    }
}
