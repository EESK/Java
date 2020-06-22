
// 단축계산 : &&연산자의 경우 첫번째 피연산자가 거짓이면 다른 피연산자들을 계산하지 않는다.
//		 : ||연산자의 경우 첫번쨰 피연산자가 참이면 다른 피연산자들을 계산하지 않는다. 

/*
 *   논리연산자 ==> if문에 주로 사용
 *   형식) && (직렬), || (병렬)
 *        ========    ======
 *          두개 ture   한개이상 true
 *        && => 범위,기간을 '포함'					ex> 20일부터 30일까지 예매가능 and쓸생각
 *        || => 범위나 기간을 '벗어나는' 경우에 주로 사용		ex> 20일 이전, 30이 이후 예매 불가 or쓸 생각
 *        
 *        jumsu>=90 (&&) jumsu<=100
 *        
 *        jumsu<=0  || jumsu>100
 *        
 *        조건 (&&,||) 조건 
 *        ===        ====
 *         true/false true/false
 *         
 *                      &&    || 
 *       ===========================
 *       true true     true   true
 *       ===========================
 *       true false    false  true
 *       ===========================
 *       false true    false  true
 *       ===========================
 *       false false   false  false
 *       ===========================
 *       
 *       6<5 && 10==10
 *       ===    ======
 *       false && true  ==> false
 *       
 *       효율적인 연산 
 *       int a=10;
 *       int b=9;
 *       
 *       a<b && (++b==a)  ==> false
 *       ===    ======
 *               연산 수행 여부 
 *       
 *       && ==> 왼쪽에 있는 조건이 false 면  두번째 피연산자 계산 X
 *       || ==> 왼쪽에 있는 조건이 true 면  두번째 피연산자 계산 X
 *       
 */


public class 이항연산자_논리연산자 {
	public static void main(String[] args) {
		
		char c1='A';
		int i=65;
		char c2='B';
		
		
		//System.out.println(c1==i || ++c1==c2);
		//System.out.println(c1); // 위문장 ||일때, c1==i가 true이니 두번째 피연산자 계산하지 않고 끝나기 때문에 ++c1수행하지 않았다. ++됐을거라는 생각에 오류 조심
		
		boolean bCheck=(c1==i||++c1==c2);
		
		 //System.out.println(bCheck); 
		 //System.out.println(c1);      //이렇게 잘 안쓰고 아래 처럼 씀
		 
		
		if(bCheck==true)
		{
			System.out.println("c1이 한개 증가"+c1);
		}
		else {
			System.out.println("c1이 한개 증가 안됨"+c1);
		}
		

		
	}
}
