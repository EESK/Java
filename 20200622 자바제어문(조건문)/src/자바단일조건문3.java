// 조건문 제작하는 방법 
/*
 *    if(조건문) : 조건문은 무조건 결과값 ==> true/false
 *      ==> 필요한 경우(조건 : true)에만 문장을 수행
 *          false일 경우에는 건너뛴다 (문장을 수행하지 못한다) 
 */
public class 자바단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha='a';
		if(alpha>='A'&& alpha<='Z')
			System.out.println(alpha+"는(은) 대문자입니다");
		if(alpha>='a'&& alpha<='z')
			System.out.println(alpha+"는(은) 소문자입니다");
		if(alpha>='0'&& alpha<='9')
			System.out.println(alpha+"는(은) 숫자입니다");
		if(alpha>='가'&& alpha<='힣')
			System.out.println(alpha+"는(은) 한글입니다");
		if(alpha=='\t'&& alpha=='\n')
			System.out.println(alpha+"특수문자입니다");
	
		
		
	}

}
