package practice3;

import java.util.Scanner;

public class _03_Trapezaid {
	
	public static void main(String[] args) {
		
		//사다리꼴 구하기
	double base, top, height;	
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("윗변 밑변 높이를 연속으로 입력(공백 구분): ");
	top = in.nextDouble();
	base = in.nextDouble();
	height = in.nextDouble();
	
	
	
	/*
	Scanner in = new Scanner(System.in);
	System.out.println("윗변 :");
	top = in.nextDouble();
	
	System.out.println("밑변 :");
	base = in.nextDouble();
	
	System.out.println("높이 :");
	height = in.nextDouble();
	*/
	
	
	double area = (top + base)*height /2 ;
	
	System.out.println("사다리꼴의 넓이는"+area+"입니다.");
	
	
	in.close();
	
	}

}
