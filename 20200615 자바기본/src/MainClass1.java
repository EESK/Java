
public class MainClass1 {
	public static void main(String[] args) {
		// 표현 : 자바에서의 표현이란..
		/*
		 * 정수
		 *   = 10진법
		 *   = 8진법
		 *       011 => 9 (앞에 0 붙어있다)
		 *   = 16진법
		 *   	 0X10
		 *   = 2진법
		 *   	 0b1010 => 10
		 * 실수
		 *   = 저장크기 => 4Byte    10.5f  (소수점 8자리)
		 *   = 저장크기 => 8Byte    10.5  (소수점 16자리)
		 * 문자
		 *   = '' => 한글자만 저장
		 * 문자열
		 *   = "" => 여러글자 저장
		 *
		 * ASC 아스키는 <c> 1byte
		 * Unicode 유니코드는 <자바> 2byte
		 *
		 */
		System.out.println('각'); //자바는 유니코드, c언어는 아스키코드 
		System.out.println("hello");
		
		System.out.println(10.5);
		System.out.println(10.5d);
		
		System.out.println(10.5f);
		System.out.println(10.5F);
		
		System.out.println(10); //10진법
		System.out.println(0b01010); //2진법
		System.out.println(012); //8진법
		System.out.println(0xA); //16진법
		
		int a = 15;
		System.out.println(a);
		
		int 국 = 15;
		System.out.println(국); 
		
		
		
		/* 기본문법
		 *    =>라이브러리 (클래스 : 대문자, 메소드는 소문자, 상수는 모두 대문자)
		 *    PI = 3.14
		 *    
		 *    변수/상수
		 *    
		 *    int kore = 100;
		 *    final int kor=200;
		 *    =>명령문이 종료가 되면 반드시 ;
		 *
		 *    
		 *    
		 * 들여쓰기 잘하기    
		 */
		
	}
}
