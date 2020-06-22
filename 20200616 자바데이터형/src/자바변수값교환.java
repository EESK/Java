/*
 *		1. 데이터형 (자료형)
 *			정수,실수,문자,논리
 *
 *			총알 ==> x,y => 좌표(int)
 *			키보드 값 ==> char 로 받아서
 *
 *			점수에 대한 평균 ==> double
 *
 *			게임 종료 여부 확인 ==> true/false ==> boolean
 *		=============================================
 *
 *		2. 데이터 저장 방법
 *			-> 한개 저장	=======>
 *							변경해서 사용 데이터 : 변수
 *							변경하지 않는 데이터 : 상수
 *			-> 여러개 저장 	=======> 같은 유형 (배열)
 *			-> 여러개 저장	=======> 다른 유형 (★클래스) => 사용자 정의 데이터형
 *
 *		3. 메모리를 만드는 방식 => 변수선언 
 *				<데이터형 변수명>; 
 *			예) byte, short, char, int, long, float, double
 *
 *		4. 변수에 대한 초기값
 *			int a=0;
 *			long a=0L;
 *			double a=0.0;
 *			boolean a=false;
 *			char c='A';
 *
 *		5. 변수값을 변경하는 방법
 *			int a=10;
 *			
 *			a=100;
 *			a=200;
 *			a=300;
 *
 *		6. 변수와 변수의 교환
 *			temp 라는 임시 변수 활용

 *		7. 변수명 명명규칙 P.25
 *
 */
public class 자바변수값교환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		int y=200;
		int temp;
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
