import sun.rmi.transport.proxy.CGIHandler;
/*
 *    int a;
 *    int b;
 *    
 *       int a,b;
 *       int a=10;
 *       int b=20;
 *       
 *       int a=10,b=10; 이렇게 쓸 수 있다
 *       
 *       x++;
 *       y++;
 *       
 *       x++,y++; 이렇게 쓸 수 있다
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		char X=(char)(c+1);
		char cc=(char)(c+32); //연산처리하면 int로 변경되서 에러남.  때문에 형변환 시켜줌.
		System.out.println(X);
		
		System.out.println('A'<=c && c<='Z' ? "대문자":"소문자");
		
	/*
	 * 'A'<=cc && cc<='Z' ==> 대문자
	 * 'a'<=cc && cc<='z' ==> 소문자
	 */
	}

}
