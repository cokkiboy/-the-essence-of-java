package ch11;

import java.util.*;

public class StackEx1 {
	 public static Stack back = new Stack();
	 public  static Stack forward = new Stack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    goURL("1");
    goURL("2");
    goURL("3");
    goURL("4");
  
    printStatus();
    
    goBack();
    System.out.println("='뒤로' 버튼을 누른후=");
    printStatus();
    
    goBack();
    System.out.println("='뒤로' 버튼을 누른후=");
    printStatus();
    
    goForward();
    System.out.println("='앞으로'버튼을 누른후'=");
    printStatus();
    
    goURL("codechobo.com");
    System.out.println("=새로운주소로 이동후=");
    printStatus();
    

    
	}
    public static void printStatus() {
    	System.out.println("back()"+back);
    	System.out.println("forward"+forward);
    	System.out.println("현재화면은'"+back.peek()+"'입니다");
    	System.out.println();
    }
    public static  void goURL(String url) {
    	back.push(url);
    	if(!forward.empty())
    		forward.clear();
    }
    public static void goForward() {
    	if(!forward.empty())
    		back.push(forward.pop());
    }
  public static void goBack() {
	  if(!back.empty())
		  forward.push(back.pop());
  }
}
