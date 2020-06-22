
public class 자바변수값변경 {
/*
 * 변수선언
 * 변수 초기화
 * 변수의 값 변경
 * 다른 변수에 값 전달
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i, j는 사용하지 않는다
		
		/*final 상수여서 에러남*/ int a=100;
		System.out.println("a="+a);
		a=200;
		System.out.println("a="+a);
		a=300;
		System.out.println("a="+a);
		
		int b=200;
		int c=b; //c라는 메모리에 b가 가지고 있는 값을 대입한다
		System.out.println("c="+c);
		
		int x,y,z;
		x=y=z=100; //오른쪽부터 z값에 대입, z값을 y에 대입, y값을 x에 대입 , 100을 int로 인식 

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
	}

}
