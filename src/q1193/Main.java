package q1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int line = 1;
		int count = 1;
		while (true) {
			int r = line;
			if (line % 2 == 0) {
				for (int i = 1; i <= line; i++) {
					if (count == x) {
						System.out.print(i + "/" + r + " ");
					}
					r--;
					count++;
				}
			} else {
				for (int i = 1; i <= line; i++) {
					if (count == x) {
						System.out.print(r + "/" + i + " ");
					}
					r--;
					count++;
				}
			}
			if (count > x) {
				break;
			}
			line++;
		}
	}
}
