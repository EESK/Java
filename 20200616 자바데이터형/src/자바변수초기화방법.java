

/*
 * 
 * ���� ==> �ʱ�ȭ
 * 	1) ���� ó�� 
 * 		ex> int a=100; // ���� ����
 * 	2) ���� 
 * 		ex> ���� ���� Ű���忡�� �޾Ƽ� ���� // �Է¹޾� ���� ��찡 ����
 * 	3) ������ ���� ����
 * 		ex> ����, �ζ� ��
 *	4)�Է�â�� ���� ���� �޴� ���
 *		ex> �˻�â �� 
 *
 *	===> ���� ���ÿ� �ʱⰪ �ο� ==>�����ڿ�
 *
 *			int a=100; 
 *	===> �����ϰ� ���߿� �ʱⰪ�� �ο� ==>����ڿ�
 *			int a;
 *			a=100;
 *
 */

// String, System, Math ==> Java.lang ==> �ڹٷ��̶�� ���� ��������
import java.util.Scanner;
public class �ڹٺ����ʱ�ȭ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		// c=(Math.random()*100)+1;			//���� ==> ����ó��
		//random(0.0~0.99)�� double���̾ ����
		
		c=(int)(Math.random()*100)+1; //int������ �ٲ��شٰ� �ؾ� ���� ���� ����
		System.out.println("������ : "+c);
		
		int d;
		Scanner scan = new Scanner(System.in);
		// System.in => Ű���� ���� �о�´�
		System.out.print("�����Է�:");
		d=scan.nextInt();
		
		System.out.println("d= "+d);
		
	}

}
