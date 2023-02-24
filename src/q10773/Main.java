package q10773;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int arr[] = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                arr[i-1] = 0;
                i--;
            }
        }
    }
}
