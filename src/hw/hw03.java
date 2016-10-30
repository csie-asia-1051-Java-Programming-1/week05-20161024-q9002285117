package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n");
		int n = scn.nextInt();
		int sum = 1;
		int m = 0;
		for (int i = 1; sum <= 10000; i++) {

			sum = sum * n;
			m++;
		}
		System.out.println("n的"+m+"次方大於10000");
	}

}
