import sun.rmi.transport.proxy.CGIHandler;
/*
 *    int a;
 *    int b;
 *    
 *       int a,b;
 *       int a=10;
 *       int b=20;
 *       
 *       int a=10,b=10; �̷��� �� �� �ִ�
 *       
 *       x++;
 *       y++;
 *       
 *       x++,y++; �̷��� �� �� �ִ�
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		char X=(char)(c+1);
		char cc=(char)(c+32); //����ó���ϸ� int�� ����Ǽ� ������.  ������ ����ȯ ������.
		System.out.println(X);
		
		System.out.println('A'<=c && c<='Z' ? "�빮��":"�ҹ���");
		
	/*
	 * 'A'<=cc && cc<='Z' ==> �빮��
	 * 'a'<=cc && cc<='z' ==> �ҹ���
	 */
	}

}
