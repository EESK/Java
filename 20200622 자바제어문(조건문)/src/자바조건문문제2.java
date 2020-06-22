//	입력
import java.util.*;
public class 자바조건문문제2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수 영어점수 수학점수");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		char score=0;
		if(avg>=90) System.out.println(score='A');
		else if(avg>=80) System.out.println(score='B');
		else if(avg>=70) System.out.println(score='C');
		else if(avg>=60) System.out.println(score='D');
		else System.out.println(score='F');
		
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
	
	}

}
