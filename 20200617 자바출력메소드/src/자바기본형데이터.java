/*
 * 
 *	�ڹ� => �⺻��
 *			�ڹٿ��� �����ϴ� ��������
 *			���� ==> boolean ==> �� : true/false : if���ǹ����� �ַ� ���
 *
 *		======>upcasting (�ڵ�����ȯ)
 * 		byte < short(char) < int < long < float < double
 *		<======downcasting (��������ȯ)
 *
 *		double d='a';  ==> d=97.0
 *		char c='a'; ==> c=a
 *		int i='A' ==> i=65 
 *
 *		byte b1=10;
 *		byte b2=20;
 *		byte b3=b1+b2; <-- ����! byte+byte �� int���ε� byte b3�ؼ� ������. �̷��� ��ƴ�.
 *
 *		byte a=10;
 *		byte b=30;
 *		byte c=(byte)(a*b);
 *			���� int�ε� ������ byte������ �ٲ����. byte�� 127(8bit)�����ε� ���� 300�̸� 100101100 �߿��� 8�ڸ����� �ν��ؼ� 44
 *			������ int�� �޾ƾ� 300ǥ�� ����
 *
 *		
 *		(int)10.5+(int)10.5 ==> 20
 *		(int)(10.5+10.5) ==> 21
 */
public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=false;
		System.out.println("b="+b);
		b=true;
		System.out.println("b="+b);
		
		System.out.println(Integer.toBinaryString(300));
		
		byte a=10;
		byte x=30;
		byte c=(byte)(a*x);
		System.out.println("byte c: "+c); //44
		
		int d=(a*x);
		System.out.println("byte d: "+d);
		
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'ȫ');
		//548615486154861 ȫȫȫ
		System.out.println((char)54861);
		// �� ���ڴ� ���ڹ�ȣ�� ������ �ִ�. (char�� ���������� �ν��Ѵ�)	
		
	}

}
