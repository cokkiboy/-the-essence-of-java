<h1> -the-essence-of-java -ch6-</h1>
<h2>overloading</h2>
<h3>오버로딩 의조건</h3>
1.메서드 이름이 같아야 한다</br>
2.매개변수의 개수 또는 타입 달라야 한다.</br>
3.오버로딩의 장점
1)메서드들은 이름이 같아서 가능이  같다는 걸알수있다.
2)메서드의 이름을 절약 할수있다. 
<h2> constructor(생성자)</h2>
<h3>생성자란</h3> 
생성자는 인스턴스 가 생성될 떄호출되는 '인스턴스초기화 메서드'이다.따라서 인스턴스 변수의 초기화 직업에 주로 사용되며, 인스턴스 생성시에 실행되어야 할 작업을위해서도 사용된다</br>
생성자의 조건</br>
1.생성자의이름은 클래스의 이름과 같아야한다.</br>
2.생성자는 리턴값이 없다.</br>
<h4>ex) Card c= new Card();</h4>
1.연산자 new에 의해서 메모리(heap)에 Card클래스의인스턴스가 생성된다.<br>
2.생성자 Card()가 호출되어 수행된다.<br>
3.연산자 new의결과로,생성된 Card인스턴스의 주소가 반환되어 참조변수c에저장된다.
<h3>this vs this()</h3>
this 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.</br>
this().this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출할떄 사용한다.
