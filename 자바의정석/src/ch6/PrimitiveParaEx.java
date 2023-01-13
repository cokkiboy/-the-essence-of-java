package ch6;
class Data{
	int x;
}
public class PrimitiveParaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Data d = new Data();
   d.x =10;
   System.out.println(d.x);
    change(d.x);
    System.out.println("main"+d.x);
	}
   static void change(int x) {
	   x =1000;
	   System.out.println(x);
   }
}
