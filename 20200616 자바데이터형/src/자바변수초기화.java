
public class 자바변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int kor=78;
		int eng=85;
		int math=96;
		
		int total = kor+eng+math;
		int avg = total/3;
		
		System.out.println("총점"+kor+eng+math);
		System.out.println("총점"+(kor+eng+math)); //괄호로 우선순위 바꿀 수 있음
		System.out.println(total);
		System.out.println(avg);
		*/
		
		int a=97;
		char c=97; //유니코드값으로 나온다.
		char xx='9';
		System.out.println("a="+a);
		System.out.println("c="+c);
		System.out.println("xx="+xx);
		
		int d=1;
		int e='1'; 
		System.out.println("d="+d);
		System.out.println("e="+e);
		/* char는 문자, 정수 취급한다
		
		long = int (O)
		int = long (X) 
		int = double (X) 크기차이 때문
		
		예외 -> char = int
		byte < short,char < int < long < float < double
		*/
		
		System.out.println(100); // 정수 쓰면 int로 인식
		System.out.println(10.8); // 실수 쓰면 double로 인식
		
		// int i = 21400000000; (X) 왼쪽이 더 커야하는데 오른쪽이 더 크다.
		// long (or) double i = 21400000000
		
	}

}
