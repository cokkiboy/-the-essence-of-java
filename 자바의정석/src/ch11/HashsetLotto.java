package ch11;

import java.util.*;

public class HashsetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Set set = new HashSet();
   for (int i = 0;  set.size()<6; i++) {
int num =(int)(Math.random()*45)+1;
set.add(num);

	
}
   List list  = new LinkedList(set);
   Collections.sort(list);
   System.out.println(list);
	}

}
