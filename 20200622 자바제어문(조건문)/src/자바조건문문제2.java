//	�Է�
import java.util.*;
public class �ڹ����ǹ�����2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� �������� ��������");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		char score=0;
		if(avg>=90) System.out.println(score='A');
		else if(avg>=80) System.out.println(score='B');
		else if(avg>=70) System.out.println(score='C');
		else if(avg>=60) System.out.println(score='D');
		else System.out.println(score='F');
		
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg);
		System.out.println("����:"+score);
	
	}

}
