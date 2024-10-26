package practice3;

import java.util.Scanner;

public class _02_yardTometer {
	public static void main(String[] args) {
		
		final double ONE_YARD = 0.9144;
		
		System.out.println("야드 입력 :");
		Scanner in = new Scanner(System.in);
		
		double yard = in.nextDouble();
		double meter = yard * ONE_YARD;
		in.close();
		
		System.out.println(yard + "는" + meter + "meter 입니다.");
		
		
	}
	

}
