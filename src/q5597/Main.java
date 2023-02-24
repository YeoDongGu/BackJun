package q5597;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ar = new int[30];

        for (int i = 0; i < ar.length - 2; i++) {
            int inp = sc.nextInt();
            ar[inp - 1] = inp;
        }
        sc.close();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                System.out.println(i + 1);
            }
        }

    }

}