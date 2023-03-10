package ch7;
interface Parseable{
	public abstract void parse(String fileName);
}
class ParserManager{
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}
		else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}
class XMLParser implements Parseable{  //인터페이스 상속할떄 implements  //구현하다
	public void parse(String fileName) {
		System.out.println(fileName +"-XML parsing completed.");
	}
}
class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName+"-HTMLparsing completed.");
	}
}
public class ParserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Parseable parser =ParserManager.getParser("XML");
          parser.parse("document.xml");
         
          parser =ParserManager.getParser("HTML");
          parser.parse("document.html");
	}

}
