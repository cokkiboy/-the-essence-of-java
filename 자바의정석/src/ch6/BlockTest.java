package ch6;

public class BlockTest {
    static {
    	System.out.println("static{}");
    }
    {
    	System.out.println("{}");
    }
    public BlockTest() {
    	System.out.println("??????");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("BlockTest bt = new BlockTest();");
     BlockTest bt = new BlockTest();
     System.out.println("BlockTest bt2 = new BlockTest();");
     
     
	}

}
