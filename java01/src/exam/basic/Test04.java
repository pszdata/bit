/*
 * 4. Literal (값의 표현)
 *  - 정수값 표현
 *   1) 32비트 정수값 : 32, 120...
 *   2) 64비트 정수값 : 32L, 591l, 11L, 11l...(대문자L로 권장)
 *   
 *  - 실수값 표현
 *   1) 32비트 실수값 : 3.14f, 3.14F... (소문자f 권장)
 *   2) 64비트 실수값 : 3.14
 *   
 *  - 문자값 표현
 *   1) 문자에 대해 정의된 코드값 : 44032, 0xAC00, 0126000 == '가' == '\uAC00' 
 *  
 *  - 논리값 표현
 *   true, false 만 가능
*/
package exam.basic;

public class Test04
{
	public static void main(String[] args)
	{
		int i = 32;
		// int i2 = 32L; // error
		long l = 32;
		long l2 = 32L;
		
		float f = 3.14f;
		// float f2 = 3.14; // error
		double d = 3.14f;
		double d2 = 3.14;
		
		char c1 = '가';
		char c2 = 44032;
		char c3 = 0xAC00;
    char c4 = 0126000;
    char c5 = '\uAC00';
    
    System.out.println("\uAC00");
    System.out.println("\u");

	
	}
}
