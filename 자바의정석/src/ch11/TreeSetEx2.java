package ch11;

import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           TreeSet set = new TreeSet();
           
           int [] score = {80,95,50,35,45,65,10,100};
           
           for(int i=0; i<score.length;i++)
        	   set.add(score[i]);
           System.out.println("50보다 작은값:"+set.headSet(50));
           System.out.println("50보다 큰값:"+set.tailSet(50));

}
}