// ����ȯ => �ڽ��� ���������� �ٸ� ������ ������������ ��ȯ
/*
 * boolean ����
 * 
 *  byte < short(char) < int < long < float < double
 * 
 * ����=> �Ǽ�, ����, ����		int a=(int)10L(10L�� int������ ��������ȯ) // long a=(long)10 (int 10�� long 10���� ���� but (�ڵ�����ȯ) long ���� upcasting �Ǿ ���� �� �ʿ�� ����.)
 * 							double d=(double)10 // (double) ���� �Ƚᵵ �ڵ� upcasting �ȴ�.
 * �Ǽ�=> ����, ����
 * ����=> ����, �Ǽ�
 * 
 * 		int i='A' ==> 65  // 'A'����ϰ�ʹٸ� (char)65
 * 
 * 		10.5+10 (������ ������ ���������� ���ƾ� �ϴµ� �޶� ����)
 * 			 ===
 * 			 10.0 (������ �ڵ����� �� ��ȯ)
 * 
 * 		'A'+1
 * 		===
 * 		65	(����)
 * 
 */
public class �ڹ�����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=5/(double)2; // == double d=5/(double)2.0;
		System.out.println("d="+d);
		
	}

}
