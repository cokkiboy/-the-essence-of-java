package ch11;
import java.util.*;
public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap map = new HashMap();
     map.put("myId", "1234");
     map.put("asdf", "1111");
     map.put("asdf", "1234");
     Scanner s=  new Scanner(System.in);
     while (true) {
		System.out.println("id�� password�� �Է��Ͻÿ�");
		System.out.println("id:");
		String id = s.nextLine().trim();
		System.out.println("password:");
		String password = s.nextLine().trim();
		System.out.println();
		if(!map.containsKey(id)) {
			System.out.println("�Է��ѽ� id�� ���������ʽ��ϴ�."+"�ٽ��Է��ϼ���");
			continue;
			
		}
		 if (!map.get(id).equals(password)) {
			 System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�. �ٽ��Է����ּ���");
			 
		}else {
			System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
			break;
		}
	}
	}

}
