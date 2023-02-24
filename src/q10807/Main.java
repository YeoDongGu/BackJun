package q10807;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }
        int V = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (ar[i] == V) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
