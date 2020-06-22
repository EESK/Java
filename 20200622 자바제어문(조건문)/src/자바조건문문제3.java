/*
 * 	사용자 입력 ==> 0,1,2
 * 	
 * 	=> 0이면 => 가위
 * 	=> 1이면 => 바위
 *  => 2라면 => 보
 */
import java.util.*;

import org.omg.PortableInterceptor.USER_EXCEPTION;
public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2)를 입력하시오. ");
		
		//유저
		int user = scan.nextInt();
		//if(user==0) System.out.println("Player : 가위");
		//if(user==1) System.out.println("Player : 바위");
		//if(user==2) System.out.println("Player : 보");
		
		//컴퓨터
		int com=(int)(Math.random()*3);
		//			  ==========
		//				0.0 ~ 0.99*3 => 0.0 ~ 2.9 ==> (int)0~2
		//if(com==0) System.out.println("Com : 가위");
		//if(com==1) System.out.println("Com : 바위");
		//if(com==2) System.out.println("Com : 보");
		
		String[] value = {"가위","바위","보"};
		System.out.println("컴퓨터:"+value[com]);
		System.out.println("유저:"+value[user]);
		
		//매치결과 (중복 조건문)
		//컴퓨터 가위
//		if(com==0) {
//			if(user==0) {System.out.println("비겼다!");}
//			if(user==1) {System.out.println("이겼다!");}
//			if(user==2) {System.out.println("졌다!");}
//		}
//		//컴퓨터 바위
//		if(com==1) {
//			if(user==0) {System.out.println("졌다!");}
//			if(user==1) {System.out.println("비겼다!");}
//			if(user==2) {System.out.println("이겼다!");}
//		}
//		//컴퓨터 보
//		if(com==2) {
//			if(user==0) {System.out.println("이겼다!");}
//			if(user==1) {System.out.println("졌다!");}
//			if(user==2) {System.out.println("비겼다!");}
//		}

		if(com-user==-2 || com-user==1)	System.out.println("computer win!");
		
		if(com-user==-1 || com-user==2) System.out.println("user win!");
		
		if(com-user==0) System.out.println("비겼다");

	}

}
