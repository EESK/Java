/*
 * 		1. 연산자
 * 			1) 연산자의 종류
 * 				==>단항연산자
 * 					= 증감연산자 (++,--)
 * 					= 부정연산자 (!)
 * 					= 부호연산자 (+, -)
 * 					= ★★★★★형변환 연산자 (int, long 등)
 * 				==>이항연산자
 * 					= ★★★★★산술연산자 (+,-,*,/,%)
 * 					/ => 0으로 나눌수는 없다
 * 					  => 정수/정수=정수  ====> 5/2=2
 * 					% => 나머지(배수)
 *  					==> 5%2 (1)
 * 						==> 5%-2 (1)
 * 						==> -5%2 (-1)
 * 						==> -5%-2 (-1)
 * 				= 비트연산자 (&,|,^)
 * 				= 쉬프트연산자 (<<, >>)
 * 				= ★★★★★비교연산자 (=, !=, >, <, <=, >=)
 * 				= ★★★★★논리연산자 (&&,||,?:)
 * 				= ★★★★★대입연산자 ( = , += , -= ...)
 * 					+=	왼쪽의 피연산자에 오른쪽의 피연산자를 더한 후, 왼쪽의 피연산자에 대입함.
					-=	왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 후, 왼쪽의 피연산자에 대입함.
 					*=	왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 후, 왼쪽의 피연산자에 대입함.
 					/=	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 왼쪽의 피연산자에 대입함.
 					%=	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 왼쪽의 피연산자에 대입함.
					.=	왼쪽 피연산자의 문자열에 오른쪽 피연산자의 문자열을 추가한 후, 왼쪽의 피연산자에 대입함.
					<<=	왼쪽의 피연산자의 비트를 오른쪽의 피연산자만큼 전부 왼쪽으로 이동시킨 후, 그 결과를 왼쪽의 피연산자에 대입함
					>>=	왼쪽의 피연산자의 비트를 부호를 유지하면서 오른쪽의 피연산자만큼 전부 오른쪽으로 이동시킨 후, 그 결과를 왼쪽의 피연산자에 대입함.
					&=	왼쪽의 피연산자와 오른쪽의 피연산자의 논리식이 모두 true면 왼쪽 피연산자에 true을 대입하고, 그 외에는 false을 대입함.
					|=	왼쪽의 피연산자나 오른쪽의 피연산자의 논리식 중 하나라도 true면 왼쪽 피연산자에 true을 대입하고, 그 외에는 false을 대입함.
					^=	왼쪽 피연산자의 논리식과 오른쪽 피연산자의 논리식이 서로 다르면 왼쪽 피연산자에 true을 대입하고, 그 외에는 false을 대입함.
 * 				==>삼항연산자 
 *               	= 조건 ? 값1:값2
 *                 	조건:true ==> 값1
 *                 	조건:false ==> 값2
 *                 
 * 			2) 연산방법
 * 				단항연산자
 * 					증감연산자
 * 						++ : 무조건 한개를 증가한다.
 * 						-- : 무조건 한개를 감소한다.
 * 						<사용법>
 * 						int a=10; 변수 선언
 * 						반복문을 사용, 게임로직	
 * 						for(int i=1, i<=10, i++)
 * 
 * 						=>전치연산자 : 증가한 다음에 대입
 * 						int a=10;
 * 						int b=++a;
 * 							1) ++계산
 * 							2) = 계산
 * 						a=11, b=11
 * 
 * 						=>후치연산자 : 대입을 먼저하고 나중에 증가
 * 						int a=10;
 * 						int b=a++
 *							1) = 계산
 *							2) ++계산
 *				
 *					부정연산자 (boolean)
 *						예) boolean bCheck=false;
 *						   !bCheck;
 *							System.out.println(bCheck) => false;
 *						   bCheck=!bCheck
 *							System.out.println(bCheck) => true;
 *							**** ! 은 메모리에 자동저장 x // ++같은건 저장됨 
 *								 int a=1;
 *								 a+100;
 *								 System.out.println(a); => 1 이것과 같은경우
 *
 *
 * 
 * 			3) 연산자 우선순위
 * 
 * 				3+4*5 인데 35의 결과값을 원한다면 (3+4)*5를 한다
 * 
 */
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		int b=++a; //a=11,b=11
		System.out.println("전위 a="+a+",b="+b);
		
		a=10;
		b=a++; //a=11,b=10
		System.out.println("후위 a="+a+",b="+b);
		
		a=10;
		b=++a + ++a + ++a + ++a;
		// 11	 12	   13    14
		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=a++ + a++ + a++ + a++;
		// 10    11	   12    13
		System.out.println("a="+a+",b="+b);
		
	}

}
