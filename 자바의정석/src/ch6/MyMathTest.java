package ch6;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyMath mm = new MyMath();
      long result1 =mm.add(5, 3);
      long result2 =mm.subtract(5, 3);
      long result3 =mm.divide(5, 3);
      long result4 =mm.subtract(5, 3);
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
      
	}

}
class MyMath{
	long add (long a,long b) {
		long result =a+b;
		return result;
		
	}
	long subtract(long a,long b) {
		long result =a-b;
		return result;
	}
	long multiply(long a,long b) {
		long result = a*b;
		return result;
	}
	long divide(long a ,long b) {
		long result=a/b;
		return result;
	}
	
}