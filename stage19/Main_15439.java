package stage19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15439 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            System.out.println(N*(N - 1));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
