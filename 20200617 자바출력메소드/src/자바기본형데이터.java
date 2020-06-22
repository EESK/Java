/*
 * 
 *	자바 => 기본형
 *			자바에서 지원하는 데이터형
 *			논리형 ==> boolean ==> 값 : true/false : if조건문에서 주로 사용
 *
 *		======>upcasting (자동형변환)
 * 		byte < short(char) < int < long < float < double
 *		<======downcasting (강제형변환)
 *
 *		double d='a';  ==> d=97.0
 *		char c='a'; ==> c=a
 *		int i='A' ==> i=65 
 *
 *		byte b1=10;
 *		byte b2=20;
 *		byte b3=b1+b2; <-- 에러! byte+byte 는 int형인데 byte b3해서 에러남. 이런게 어렵다.
 *
 *		byte a=10;
 *		byte b=30;
 *		byte c=(byte)(a*b);
 *			원래 int인데 강제로 byte값으로 바꿔놓음. byte는 127(8bit)까지인데 값이 300이면 100101100 중에서 8자리까지 인식해서 44
 *			때문에 int로 받아야 300표현 가능
 *
 *		
 *		(int)10.5+(int)10.5 ==> 20
 *		(int)(10.5+10.5) ==> 21
 */
public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=false;
		System.out.println("b="+b);
		b=true;
		System.out.println("b="+b);
		
		System.out.println(Integer.toBinaryString(300));
		
		byte a=10;
		byte x=30;
		byte c=(byte)(a*x);
		System.out.println("byte c: "+c); //44
		
		int d=(a*x);
		System.out.println("byte d: "+d);
		
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'홍');
		//548615486154861 홍홍홍
		System.out.println((char)54861);
		// 각 문자는 숫자번호를 가지고 있다. (char는 정수형으로 인식한다)	
		
	}

}
