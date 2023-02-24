package q2562;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[9];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        sc.close();
        System.out.println(max);
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == max) {
                System.out.println(i + 1);
            }
        }
    }

}