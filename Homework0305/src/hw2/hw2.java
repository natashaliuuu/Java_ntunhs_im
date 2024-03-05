package hw2;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int fv;
		int pv;
		final double i = 0.05;
		int n;
		System.out.print("請輸入本金");
		pv = scn.nextInt();
		System.out.print("請輸入週期");
		n = scn.nextInt();
		fv = (int)(pv * Math.pow((1+i), n));
		System.out.print("My pv is "+pv+", and after "+n+" tear it would be "+fv);

	}

}
