
public class MainClass1 {
	public static void main(String[] args) {
		// ǥ�� : �ڹٿ����� ǥ���̶�..
		/*
		 * ����
		 *   = 10����
		 *   = 8����
		 *       011 => 9 (�տ� 0 �پ��ִ�)
		 *   = 16����
		 *   	 0X10
		 *   = 2����
		 *   	 0b1010 => 10
		 * �Ǽ�
		 *   = ����ũ�� => 4Byte    10.5f  (�Ҽ��� 8�ڸ�)
		 *   = ����ũ�� => 8Byte    10.5  (�Ҽ��� 16�ڸ�)
		 * ����
		 *   = '' => �ѱ��ڸ� ����
		 * ���ڿ�
		 *   = "" => �������� ����
		 *
		 * ASC �ƽ�Ű�� <c> 1byte
		 * Unicode �����ڵ�� <�ڹ�> 2byte
		 *
		 */
		System.out.println('��'); //�ڹٴ� �����ڵ�, c���� �ƽ�Ű�ڵ� 
		System.out.println("hello");
		
		System.out.println(10.5);
		System.out.println(10.5d);
		
		System.out.println(10.5f);
		System.out.println(10.5F);
		
		System.out.println(10); //10����
		System.out.println(0b01010); //2����
		System.out.println(012); //8����
		System.out.println(0xA); //16����
		
		int a = 15;
		System.out.println(a);
		
		int �� = 15;
		System.out.println(��); 
		
		
		
		/* �⺻����
		 *    =>���̺귯�� (Ŭ���� : �빮��, �޼ҵ�� �ҹ���, ����� ��� �빮��)
		 *    PI = 3.14
		 *    
		 *    ����/���
		 *    
		 *    int kore = 100;
		 *    final int kor=200;
		 *    =>��ɹ��� ���ᰡ �Ǹ� �ݵ�� ;
		 *
		 *    
		 *    
		 * �鿩���� ���ϱ�    
		 */
		
	}
}
