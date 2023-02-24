package q10773;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int arr[] = new int[100000];
        int n = 0;
        int c = 1;
        int sum = 0;

        while (c <= k) {
            arr[n] = sc.nextInt();
            if (arr[n] == 0) {
                arr[n - 1] = 0;
                n--;
                c++;
                continue;
            }
            n++;
            c++;
        }
        for (int j : arr) {
            if (j != 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
