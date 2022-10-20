package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("Tong tu 1 den 100 = " + sum);
	}
}
