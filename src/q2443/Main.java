package q2443;

//별찍기
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();
        for (int i = 0; i < N; i++) {
            for (int k = N - i; k < N; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j < 2 * (N - i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}