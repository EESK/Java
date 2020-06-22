//import java.util.Scanner;
import java.util.*;

import com.sun.xml.internal.ws.api.pipe.NextAction;
public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \n은 다음줄 
		// \t는 탭(일정간격)
		/*
		System.out.printf("%d*%d=%d\t",2,2,4);
		System.out.printf("%d*%d=%d\n",2,3,6);
		
		 * 
		 * Scanner : 데이터형
		 * scan : 변수
		 * new : 메모리에 저장 (메모리 크기를 결정)
		 * Scanner(System.in) : 초기화
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("1' 정수입력 ");
		//int a = scan.nextInt();
		//System.out.print("2' 정수입력 "); 
		//int b = scan.nextInt();
		
		//System.out.println("a = "+a);
		//System.out.println("b = "+b);

		
		//System.out.print("실수 입력 : ");
		//double dd = scan.nextDouble();
		//System.out.printf("dd:%f ",dd);
		
		System.out.println(Integer.toBinaryString(240));
		System.out.println(Integer.toOctalString(240));
		System.out.println(Integer.toHexString(240));
		
		System.out.println("0110");
		System.out.println(0b11110000);
		System.out.println(0360);
		System.out.println(0xf0);
		System.out.println(~100); //음수
		
	}

}
