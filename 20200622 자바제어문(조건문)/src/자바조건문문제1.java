/*
 * 	1. 정수를 입력 받아서 짝수인지 홀수인지 확인 => 10은 짝수다, 11은 홀수다
 * 									========= ========= if~else
 * 	2. 정수 3개를 입력 받아서 총점, 평균, 학점(조건문) 
 * 								60이상 =>D, 70이상=>C, 80이상=>B, 90이상=>A 나머지는 F
 * 		국어점수 80, 영어점수80, 수학점수80
 * 
 * 		총점 : 240, 평균 : 80.0, 학점 : B
 */

import java.util.*;
public class 자바조건문문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번  정수를 입력 받아서 짝수인지 홀수인지 확인 
		System.out.print("정수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a%2==0)
			System.out.println("입력된 정수는 짝수입니다");
		else
			System.out.println("입력된 정수는 홀수입니다");
		
		System.out.println("\n");
		//정수 3개를 입력 받아서 총점, 평균, 학점
		
		int kor=80, eng=80, math=80;
		int total = kor+eng+math;
		double avg = total/3;
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	
		if(avg>=90) System.out.println("학점:A");
		else if(avg>=80) System.out.println("학점:B");
		else if(avg>=70) System.out.println("학점:C");
		else if(avg>=60) System.out.println("학점:D");
		else System.out.println("학점:F");
		
		
	}

}
