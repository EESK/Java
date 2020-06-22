

/*
 * 
 * 변수 ==> 초기화
 * 	1) 직접 처리 
 * 		ex> int a=100; // 많지 않음
 * 	2) 선언 
 * 		ex> 계산기 같이 키보드에서 받아서 저장 // 입력받아 쓰는 경우가 많음
 * 	3) 임의의 수를 저장
 * 		ex> 게임, 로또 둥
 *	4)입력창을 만들어서 값을 받는 방법
 *		ex> 검색창 등 
 *
 *	===> 선언 동시에 초기값 부여 ==>관리자용
 *
 *			int a=100; 
 *	===> 선언하고 나중에 초기값을 부여 ==>사용자용
 *			int a;
 *			a=100;
 *
 */

// String, System, Math ==> Java.lang ==> 자바랭이라는 폴더 생략가능
import java.util.Scanner;
public class 자바변수초기화방법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		// c=(Math.random()*100)+1;			//가공 ==> 연산처리
		//random(0.0~0.99)이 double형이어서 에러
		
		c=(int)(Math.random()*100)+1; //int형으로 바꿔준다고 해야 에러 방지 가능
		System.out.println("랜덤값 : "+c);
		
		int d;
		Scanner scan = new Scanner(System.in);
		// System.in => 키보드 값을 읽어온다
		System.out.print("정수입력:");
		d=scan.nextInt();
		
		System.out.println("d= "+d);
		
	}

}
