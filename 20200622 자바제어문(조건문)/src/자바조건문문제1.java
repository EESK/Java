/*
 * 	1. ������ �Է� �޾Ƽ� ¦������ Ȧ������ Ȯ�� => 10�� ¦����, 11�� Ȧ����
 * 									========= ========= if~else
 * 	2. ���� 3���� �Է� �޾Ƽ� ����, ���, ����(���ǹ�) 
 * 								60�̻� =>D, 70�̻�=>C, 80�̻�=>B, 90�̻�=>A �������� F
 * 		�������� 80, ��������80, ��������80
 * 
 * 		���� : 240, ��� : 80.0, ���� : B
 */

import java.util.*;
public class �ڹ����ǹ�����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1��  ������ �Է� �޾Ƽ� ¦������ Ȧ������ Ȯ�� 
		System.out.print("������ �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a%2==0)
			System.out.println("�Էµ� ������ ¦���Դϴ�");
		else
			System.out.println("�Էµ� ������ Ȧ���Դϴ�");
		
		System.out.println("\n");
		//���� 3���� �Է� �޾Ƽ� ����, ���, ����
		
		int kor=80, eng=80, math=80;
		int total = kor+eng+math;
		double avg = total/3;
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
	
		if(avg>=90) System.out.println("����:A");
		else if(avg>=80) System.out.println("����:B");
		else if(avg>=70) System.out.println("����:C");
		else if(avg>=60) System.out.println("����:D");
		else System.out.println("����:F");
		
		
	}

}
