package q2442;

//별찍기
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }

}