/*
 *    �ʿ�ÿ� ���������� �����ؼ� ��� : ���� ����ȯ 
 *    
 *    int + double =double (�ڵ� ����ȯ)
 *    ===
 *    double
 *    
 *    char + int = int 
 *    ====
 *     int
 *     
 *    int + long = long
 *    ===
 *    long
 *    
 *    char + int + long + double = double 
 *    ====
 *     int
 *    ==========
 *       int     
 *     ========
 *       long
 *     ========double
 *     
 *     (int)double ==> int ==> ū������ =>���� ������ ����
 *     (char)int ==> char
 *     
 *     1) boolean�� ���� 
 *     2) int���ϴ� ������ �ϸ� ������� int
 *        byte+byte => int
 *        char+char => int
 *        short+byte => int
 *        char+byte+short=> int   
 * ���� ���������� �� ���� ����ϸ� �ӵ��� �ʾ���. ����õ.
 */

public class ���׿�����_����ȯ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		byte b=10;
		byte c=10;
		byte x=(byte)(b+c);
		System.out.println(x);
		int d=b+c;
		System.out.println(d);
		*/
		
		int a='A'; // a=65
		double d=10; // d=10.0 (�ڵ�����ȯ)
			   //int
		char c=65; // c='A'
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//���� ����ȯ
		
		int i=(int)10.5; // int�� 4����Ʈ 10.5�� 8����Ʈ�̱� ������
		int ii=(int)'A'; //�ڵ����� int�� �ٲ�
		System.out.println("\ni="+i);
		System.out.println("ii="+ii);
	}

}
