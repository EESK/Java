/*
 * 	자바에서 사용하는 데이터형 (자료형) => 메모리의 크기 지정
 * 
 * 	정수
 * 		->  byte (0,1을 8개를 저장하는 공간) => 8bit(=1byte)
 * 			1111 1111 음수 -128
 * 			0111 1111 양수   127 
 * 			: -128~127 저장
 * 				파일읽기, 파일쓰기, 파일업로드, 파일다운로드, 네트워크 전송
 *   			ex> 주소창의 oq=%EC%9E%90%EB%B0%94 =>'자바'의 바이트형
 *   	
 *   	->  short (0,1을 16개 저장하는 공간) => 16bit(=2byte)
 *   		1111 1111 1111 1111 -32768
 *   		0111 1111 1111 1111  32768
 *   			c언어와 호화성(사용빈도 없다)
 *   
 *   	->  int (0,1을 32개 저장하는 공간) => 32bit(=4byte) default 메모리가 4byte이니 나누고 쪼갤 필요가 없어서 속도 빠를 것이다.
 *   		1111 1111 1111 1111 1111 1111 1111 1111 약 -21억
 *   		0111 1111 1111 1111 1111 1111 1111 1111 약  21억
 *   			자바코딩의 정수는 대부분 사용
 *   
 *   	->  long (0,1을 64개 저장하는 공간) => 64bit(=8byte)
 *   			빅데이터, 금융권, 주식
 *   			
 *   	국어점수 : byte, short, int, long ==> int (속도면에서 빠름)
 *      영어점수 : byte, short, int, long ==> int
 *      수학점수 : byte, short, int, long ==> int
 *      총점 : (300) : byte(X), short, int, long ==> int
 *      
 *      우리나라의 연봉 : byte(X), short(X), int(X), long ==> long 21억 넘는 사람도 있으니..
 *      
 * 	실수
 * 		->  4byte 소수점 6자리	(float)
 * 		->  8byte 소수점 15자리(double) - default
 * 		****문제점
 * 			작은 데이터는 큰데이터에 추가(O) 반대경우는 (X)
 * 			float f = 10.5 (X) float f = 10.5f (O)
 * 	문자
 * 		->  char (0,1을 16개 저장하는 공간) => 16bit(=2byte)
 * 			음수는 없이 양수만 0~65535
 * 			*문자마다 고유의 번호
 * 			'A' = 65
 * 			'a' = 97
 * 			'0' = 49
 * 
 * 	논리
 * 		->  true/false => boolean (1byte)
 * 			로그인창, id체크
 *	
 *	메모리에 저장하는 크기 (숫자를 얼마나 다양하게 표현 할 수 있는가? byte 크기차이 X)
 *		 byte < short < int < long < float < double
 *			  < char
 *
 *	변수 : 한개의 데이터를 저장하는 메모리 공간의 별칭
 *	변수명제작
 *			1) 알파벳이나 한글로 시작
 *			2) 숫자 사용가능하나 숫자로 시작 X
 *			3) 특수문자 (_,$ 사용가능)
 *			4) 키워드 (자바에서 사용중인 단어)눈 없었는데
 *				but int int1 이런식은 가능
 *			5: 변수의 길이는 15자 이내로한다.	
 *
 *
 *	========================
 *	변수에 초기화
 *	1.  정수형
 *		byte => 0
 *		short => 0
 *		int => 0
 *		long => 0
 *	2.  실수형
 *		float => 0.0f
 *		double=> 0.0d
 *	3.  문자형 ==> 'A' ==> ''(error)
 *	
 *	4.  논리형
 *		boolean => false/true
 *
 *		*** 모든 변수는 초기화를 해야 한다
 *
 */

public class 자바데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char A = 'a';
		char B = 'b';
		
		int X= A+B;
		System.out.println(X);
		*/
		
		//국영수 총점 평균 학점
		
		int kor=80;
		int eng=80; 
		int math=80;
		
		int total=240;
		double avg=80;
		char score='B';
				
		System.out.println("국어점수:" + kor);
		System.out.println("영어점수:" + eng);
		System.out.println("수학점수:" + math);
		System.out.println("총점:" + total);
		System.out.println("평균점수:" + avg);
		System.out.println("학점:" + score);

	}

}
