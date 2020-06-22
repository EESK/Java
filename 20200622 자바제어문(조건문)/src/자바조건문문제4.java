/*
 *    두개의 정수를 받아서 
 *    최대값,최소값 
 *    
 *    int a,b
 *    int max,min
 */

import java.util.*;
public class 자바조건문문제4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		
		 System.out.print("두개의 정수를 입력 "); 
		 int a = scan.nextInt(); 
		 int b = scan.nextInt();
		  
		  //System.out.println("Max="+Math.max(a, b));
		  //System.out.println("Mix="+Math.min(a, b)); //라이브러리 활용
		  
		  int min, max; //초기화 안해도 에러 안나네? ★★★★★ if-else 를 썼기때문에.. if if(단일조건문)는 안 됨 ★★★★★
		  if(a>b) { max=a; min=b; } 
		  else { max=b; min=a; }
		  
		  System.out.println("max="+max); System.out.println("min="+min);
		 
		
		
		//정수를 입력받아서 절대값을 출력하는 프로그램
		// 1, -1 ==> 1
		
//		System.out.print("정수를 입력 ");
//		
//		int a=scan.nextInt();
//		
//		//System.out.print("절대값:"+Math.abs(a)); //라이브러리 활용
//		
//		if(a<0) System.out.println(-1*a);
//		else System.out.println(a);
	}

}
