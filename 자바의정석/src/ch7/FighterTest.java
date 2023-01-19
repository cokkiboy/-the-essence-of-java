package ch7;

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Fighter f =new Fighter();
       if(f instanceof Unit1)
    	   System.out.println("f는 unit클래스의 자손입니다,");
       if(f instanceof Fightable)
    	   System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
       if(f instanceof Movable)
    	   System.out.println("f는 Movable 인터페이스를 구현했습니다");
       if(f instanceof Attackable)
    	   System.out.println("f는  Attackable인터페이스를 구현했습니다");
       if(f instanceof Object)
    	   System.out.println("f는 Object클래스의 자손입니다.");
       
	}

}
class Fighter extends Unit1 implements Fightable{
	public void move(int x,int y) {
		
	}
	public void attack(Unit1 u) {
		
	}
	
}
class Unit1{
	int currentHp;
	int x;
	int y;
}
interface Fightable extends Movable,Attackable{
	
}
interface Movable{
	void move(int x ,int y);
}
interface Attackable{
	void attack(Unit1 u);
}