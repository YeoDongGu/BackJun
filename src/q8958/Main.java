package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			int cur = 1;
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O') {
					sum += cur++;
				} else {
					cur = 1;
				}
			}
			System.out.println(sum);
		}

		sc.close();

	}

}