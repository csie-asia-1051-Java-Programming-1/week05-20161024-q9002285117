package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入正整數n");
		int n = scn.nextInt();
		int sum = 0;
		int m = 0;
		for (int i = 1; sum <= n; i++) {

			sum = sum + i;
			m++;
		}
		System.out.println("m值為:" + (m - 1));
	}

}
