package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@��n��");
		int n = scn.nextInt();
		int sum = 1;
		int m = 0;
		for (int i = 1; sum <= 10000; i++) {

			sum = sum * n;
			m++;
		}
		System.out.println("n��"+m+"����j��10000");
	}

}
