/*
 *   ���� => 
 *       ��� : ������� �� �� ���� (������� int, double, float ��� ������ ��
 *             int+int = int
 *             double + int = double
 *             float+long = float
 *       ====================
 *       �� : true/false
 *       �� : true/false
 *       ==================== ���ǹ� (if)
 *       ����
 *    �񱳿�����  : ���� ���� �� => ����,�Ǽ�,����,��
 *              ���ڿ��� ���� �� ���� 
 *              "Hello"=="Hello" ===> equals()
 *              ==> ���ڿ��� �����ϴ� �������� => String
 *              char c='Hello'
 *              String s="Hello"
 *     1) ���� 
 *        ==  : ����           ==> 10==20 (false)
 *        !=  : ���� �ʴ�    ==> 10!=20 (true)
 *        <   : �۴�           ==> 10<10  (false)
 *        >   : ũ��           ==> 10>10  (false)
 *        <=  : �۰ų� ����  ==> 10<=10 (true)
 *                           10<10 || 10==10
 *        >=  : ũ�ų� ����  ==> 10>=10 (true)
 *                           10>10 || 10==10
 *     2) ����� : boolean
 */
public class ���׿�����_�񱳿����� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		//System.out.println(++b==a);
		System.out.println(b++==a);
        //System.out.println(10==20);// false
        //System.out.println(10!=20);//true
        //System.out.println(10<10);//false
        //System.out.println(10>10);//false
        //System.out.println(10<=10);//true
        //System.out.println(10>=10);//true
	}

}