package exam.basic;

import java.util.Scanner;

public class Control01_t01
{
	public static void main(String[] args)
  {
		int nData1 = 0;
		int nData2 = 0;
		String opr = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		nData1 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력하세요 : ");
		opr = sc.nextLine();
		System.out.print("두번째 수를 입력하세요 : ");
		nData2 = Integer.parseInt(sc.nextLine());
		switch (opr)
    {
		case "+":	nData1 += nData2;	break;
		case "-":	nData1 -= nData2;	break;
		case "*":	nData1 *= nData2;	break;
		case "/":	nData1 /= nData2;	break;
		default:	
			System.out.println("연산자가 잘못되었습니다.");
			System.exit(0);
    }
		System.out.println("계산 결과는 " + nData1 + " 입니다.");
		
		sc.close();
  }
	public static void main02(String[] args)
	{
		// 문제2)
		// 다음과 같이 동작하도록 코드를 구현하세요
		// 첫번째 수를 입력하세요 : 10
		// 연산자를 입력하세요 : (+ == 0, - == 1, * == 2, / == 3)
		// 두번째 수를 입력하세요 : 2
		// 계산 결과는 5 입니다.
		int nData1 = 0;
		int nData2 = 0;
		int opr = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		nData1 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력하세요\n(+(0), -(1), *(2), /(3)) : ");
		opr = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 수를 입력하세요 : ");
		nData2 = Integer.parseInt(sc.nextLine());
		switch (opr)
    {
		case 0:	nData1 += nData2;	break;
		case 1:	nData1 -= nData2;	break;
		case 2:	nData1 *= nData2;	break;
		case 3:	nData1 /= nData2;	break;
		default:	System.out.println("연산자가 잘못되었습니다.");
		}
		System.out.println("계산 결과는 " + nData1 + " 입니다.");
		
		sc.close();
		
	}
	public static void main01(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는? : ");
		int age = Integer.parseInt(sc.nextLine());

		if(age <= 7)	
			System.out.println("유아입니다.");
		else if(8 <= age && age < 18) 
			System.out.println("청소년입니다.");
		else if(18 <= age && age < 30) 
			System.out.println("청년입니다.");
		else if(30 <= age && age < 50) 
			System.out.println("장년입니다.");
		else if(50 <= age && age < 60) 
			System.out.println("중년입니다.");
		else 
			System.out.println("노인입니다.");
		
		sc.close();
		
		
		
	}

}
