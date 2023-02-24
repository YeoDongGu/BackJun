package q1110;

import java.util.Scanner;

public class Main {
	public void plusCycle(int n) {
		int count = 0;
		int x = n;

		while (true) {
			x = (x % 10) * 10 + (x / 10 + x % 10) % 10;
			count++;
			if (x == n) {
				break;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Main m = new Main();
		m.plusCycle(n);

	}

}
