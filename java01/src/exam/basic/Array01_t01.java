package exam.basic;

/*
 * 배열
 * 	- 같은 종류의 메모리를 여러개 만드는 것
 * 	- 
 */

public class Array01_t01
{
	public static void main(String[] args)
  {
	  int[] arr= new int[3]; // int형메모리 3개 준비
//	int[] arr -> int배열의 주소를 저장하는 레퍼런스(변수)
  }
	public static void mainx(String[] args)
	{
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		int[] soc = new int[10];
		int[] sci = new int[10];
		int[] tot = new int[10];
		float[] aver = new float[10];

		
		
		
	}
	
	public static void main01(String[] args)
	{
		int kor, eng, math, soc, sci, tot;
		float aver;
		
		kor = 100;
		eng = 90;
		math = 90;
		soc = 72;
		sci = 86;
		
		tot = kor + eng + math + soc + sci;
		aver = (float)tot / (float)5;
		System.out.println("평균 : " + aver);
		
	}

}
