/*
 * 	����� �Է� ==> 0,1,2
 * 	
 * 	=> 0�̸� => ����
 * 	=> 1�̸� => ����
 *  => 2��� => ��
 */
import java.util.*;

import org.omg.PortableInterceptor.USER_EXCEPTION;
public class �ڹ����ǹ�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2)�� �Է��Ͻÿ�. ");
		
		//����
		int user = scan.nextInt();
		//if(user==0) System.out.println("Player : ����");
		//if(user==1) System.out.println("Player : ����");
		//if(user==2) System.out.println("Player : ��");
		
		//��ǻ��
		int com=(int)(Math.random()*3);
		//			  ==========
		//				0.0 ~ 0.99*3 => 0.0 ~ 2.9 ==> (int)0~2
		//if(com==0) System.out.println("Com : ����");
		//if(com==1) System.out.println("Com : ����");
		//if(com==2) System.out.println("Com : ��");
		
		String[] value = {"����","����","��"};
		System.out.println("��ǻ��:"+value[com]);
		System.out.println("����:"+value[user]);
		
		//��ġ��� (�ߺ� ���ǹ�)
		//��ǻ�� ����
//		if(com==0) {
//			if(user==0) {System.out.println("����!");}
//			if(user==1) {System.out.println("�̰��!");}
//			if(user==2) {System.out.println("����!");}
//		}
//		//��ǻ�� ����
//		if(com==1) {
//			if(user==0) {System.out.println("����!");}
//			if(user==1) {System.out.println("����!");}
//			if(user==2) {System.out.println("�̰��!");}
//		}
//		//��ǻ�� ��
//		if(com==2) {
//			if(user==0) {System.out.println("�̰��!");}
//			if(user==1) {System.out.println("����!");}
//			if(user==2) {System.out.println("����!");}
//		}

		if(com-user==-2 || com-user==1)	System.out.println("computer win!");
		
		if(com-user==-1 || com-user==2) System.out.println("user win!");
		
		if(com-user==0) System.out.println("����");

	}

}
