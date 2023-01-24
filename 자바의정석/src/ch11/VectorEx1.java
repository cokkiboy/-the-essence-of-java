package ch11;

import java.util.*;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector  v = new Vector(5);
      v.add("1");
      v.add("2");
      v.add("3");
      v.add("4");
      v.add("5");
      print(v);
      
      v.trimToSize();
      System.out.println("===After trimeToSize()===");
      print(v);
      
      v.ensureCapacity(6);
      System.out.println("===After ensureCapacity(6)===");
      print(v);
      
      v.setSize(7);
      System.out.println("===After setSize(7)  ===");
      print(v);
      
      v.clear();
      System.out.println("===After clear()===");
      print(v);
     
	}
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
	}

}
