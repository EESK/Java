/*
 * 
 * 	ȭ�� ���
 * 		= System.out.println(); => �����ٿ� ���
 * 		= System.out.print(); => �̾ ���
 * 		= System.out.printf(); => ������ �ִ� ���
 * 			80 80 80 240 80.0 B
 * 			System.out.printf("%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B');
 * 
 */
public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-5d%-5d%-5d%-6d%-7.1f%-5c\n", 80,80,80,240,80.0,'B');
		
		
		int a=2,b=2;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b); //JDK 1.5
		
	}

}
