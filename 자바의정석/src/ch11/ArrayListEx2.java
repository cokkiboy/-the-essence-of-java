<<<<<<< HEAD
package ch11;

import java.util.*;

public class ArrayListEx2 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      final int LIMIT =10;
      String source ="0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
      int length = source.length();
      List list = new ArrayList(length/LIMIT +10);
      for(int i=0;i<length;i+=LIMIT) {
    	  if(i+LIMIT<length) 
    		   list.add(source.substring(i,i+LIMIT));
    	  
    	  else
    		  list.add(source.substring(i));
      }
	}

}
=======
package ch11;

import java.util.*;

public class ArrayListEx2 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      final int LIMIT =10;
      String source ="0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
      int length = source.length();
      List list = new ArrayList(length/LIMIT +10);
      for(int i=0;i<length;i+=LIMIT) {
    	  if(i+LIMIT<length) 
    		   list.add(source.substring(i,i+LIMIT));
    	  
    	  else
    		  list.add(source.substring(i));
      }
	}

}
>>>>>>> 33e4280ccbbde02ec7153a34ae40dba716ee90eb
