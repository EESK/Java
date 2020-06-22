// 형변환 => 자신의 데이터형은 다른 형식의 데이터형으로 변환
/*
 * boolean 제외
 * 
 *  byte < short(char) < int < long < float < double
 * 
 * 정수=> 실수, 문자, 정수		int a=(int)10L(10L을 int형으로 강제형변환) // long a=(long)10 (int 10을 long 10으로 높임 but (자동형변환) long 으로 upcasting 되어서 굳이 할 필요는 없다.)
 * 							double d=(double)10 // (double) 굳이 안써도 자동 upcasting 된다.
 * 실수=> 정수, 문자
 * 문자=> 정수, 실수
 * 
 * 		int i='A' ==> 65  // 'A'출력하고싶다면 (char)65
 * 
 * 		10.5+10 (연산은 무조건 데이터형이 같아야 하는데 달라서 못함)
 * 			 ===
 * 			 10.0 (때문에 자동으로 형 변환)
 * 
 * 		'A'+1
 * 		===
 * 		65	(동일)
 * 
 */
public class 자바형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=5/(double)2; // == double d=5/(double)2.0;
		System.out.println("d="+d);
		
	}

}
