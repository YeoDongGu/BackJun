package q8958;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		int[][] ar = new int[row][];

		for (int i = 0; i < ar.length; i++) {
			String str = sc.next();
			ar[i] = new int[str.length()];
			int sum = 0;
			for (int j = 0; j < ar[i].length; j++) {
				int count = 0;

				while (true) {
					ar[i][j] = str.charAt(j);
					if (ar[i][j] == 'O') {
						sum += ++count;
						j++;
					}
					if (j == ar[i].length) {
						break;
					}
					if (ar[i][j] == 'X') {
						break;
					}

				}
			}
			System.out.println(sum);
		}
		sc.close();

	}
}