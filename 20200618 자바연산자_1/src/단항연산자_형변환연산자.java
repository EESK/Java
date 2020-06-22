/*
 *    필요시에 데이터형을 변경해서 사용 : 강제 형변환 
 *    
 *    int + double =double (자동 형변환)
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
 *     (int)double ==> int ==> 큰데이터 =>작은 데이터 변경
 *     (char)int ==> char
 *     
 *     1) boolean은 제외 
 *     2) int이하는 연산을 하면 결과값이 int
 *        byte+byte => int
 *        char+char => int
 *        short+byte => int
 *        char+byte+short=> int   
 * 많은 데이터형을 한 번에 계산하면 속도가 늦어짐. 비추천.
 */

public class 단항연산자_형변환연산자 {

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
		double d=10; // d=10.0 (자동형변환)
			   //int
		char c=65; // c='A'
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//강제 형변환
		
		int i=(int)10.5; // int는 4바이트 10.5는 8바이트이기 떄문에
		int ii=(int)'A'; //자동으로 int로 바뀜
		System.out.println("\ni="+i);
		System.out.println("ii="+ii);
	}

}
