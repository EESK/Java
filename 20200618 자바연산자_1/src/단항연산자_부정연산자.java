/*
 *    부정 연산자 :  !
 *      => true=>false , false=>true
 *      => 결과값 : boolean
 *      
 *         단항 : 증감 => int
 *               부정 => boolean
 *         이항 :
 *            산술 => ? (결과값 모름)
 *               int + int = int
 *               double + int =double
 *            비교 , 논리 => boolean (무조건 boolean)
 *            
 *            삼항연산자 
 *              조건?값1:값2 => (결과값 모름)
 *              sex==1?"남자":"여자"
 *              sex==1?'M':'W'
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		boolean bCheck=true;
		System.out.println("bCheck="+bCheck);
		bCheck=!bCheck; // true의 반대갑을 저장한다
		System.out.println("bCheck="+bCheck);
		bCheck=!bCheck;
		System.out.println("bCheck="+bCheck);
		*/
		boolean bCheck=true;
		for(int i=0;i<10;i++)
        {
          bCheck=!bCheck;
			
			if(bCheck==true) 
			{ System.out.println("본인"); } else {
			System.out.println("컴퓨터"); }
			
          System.out.println("bCheck="+bCheck);}
	}
}
