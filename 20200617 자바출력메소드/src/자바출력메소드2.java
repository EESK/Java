//import java.util.Scanner;
import java.util.*;

import com.sun.xml.internal.ws.api.pipe.NextAction;
public class �ڹ���¸޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \n�� ������ 
		// \t�� ��(��������)
		/*
		System.out.printf("%d*%d=%d\t",2,2,4);
		System.out.printf("%d*%d=%d\n",2,3,6);
		
		 * 
		 * Scanner : ��������
		 * scan : ����
		 * new : �޸𸮿� ���� (�޸� ũ�⸦ ����)
		 * Scanner(System.in) : �ʱ�ȭ
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("1' �����Է� ");
		//int a = scan.nextInt();
		//System.out.print("2' �����Է� "); 
		//int b = scan.nextInt();
		
		//System.out.println("a = "+a);
		//System.out.println("b = "+b);

		
		//System.out.print("�Ǽ� �Է� : ");
		//double dd = scan.nextDouble();
		//System.out.printf("dd:%f ",dd);
		
		System.out.println(Integer.toBinaryString(240));
		System.out.println(Integer.toOctalString(240));
		System.out.println(Integer.toHexString(240));
		
		System.out.println("0110");
		System.out.println(0b11110000);
		System.out.println(0360);
		System.out.println(0xf0);
		System.out.println(~100); //����
		
	}

}
