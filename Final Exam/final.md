1. String 클래스와 StringBuilder, StringBuffer 클래스의 차이를 정리해주세요.

String 클래스는 String 데이터를 업데이트하면 기존의 String을 버리고, 새로운 String을 생성.
StringBuilder, StringBuffer 클래스는 String 클래스와 다르게 append() 메소드를 통해 기존의 String 뒤에 붙일 수 있다.

StringBuilder -> not gurantee synchroniztation -> multiple threads를 사용할 경우 not safe
StringBuffer -> gurantee synchronization -> multiple threads에도 safe


------------------------------------------------------------------------------------------------------

2. String 클래스의 indexOf(), substring(), split(), getBytes() 메소드가 어떤 용도로 사용되는지 정리해 주세요.

indexOf()
    해당 문자가 처음 나오는 곳의 인덱스 번호 반환
    
    ex)
    indextOf(String char)

substring()
	String에서 character 추출
    
	ex)
     String c = "abc".substring(2, 3);
     String d = cde.substring(1, 2);
     
split(String regex)
    구분자(regex)를 기준으로 구분한 String 배열을 반환
    ex) "boo:and:foo"
    Regex    Result
    :    { "boo", "and", "foo" }
    o    { "b", "", ":and:f" }

getBytes()
    String의 각 문자를 byte로 encoding한 배열을 반환

------------------------------------------------------------------------------------------------------

3. System 클래스의 주요 용도를 정리해 주세요.

The System class contains several useful class fields and methods. It cannot be instantiated. 
Among the facilities provided by the System class are
    1) standard input, standard output, and error output streams;
    2) access to externally defined properties and environment variables; 
    3) a means of loading files and libraries; 
    4) get current time;
    5) and a utility method for quickly copying a portion of an array.

------------------------------------------------------------------------------------------------------

4. System 클래스에서 여러분들이 절대로 사용해서는 안 되는 메소드들은 무엇이고, 그 이유를 정리해주세요.

Garbage Collector 수행
gc() : garbage colletor를 실행한다.
runFinalization() : GC 처리를 기다리는 모든 객체에 대해 finalize() 메소드를 실행한다.

이 메소드를 호출하는 코드를 집어 넣으면, 시스템은 하려던 일들을 멈추고 이 작업을 실행하게 된다.
자바는 메모리 처리를 개발자가 별도로 하지 앟는다. 이 두개의 메소드들을 호출하지 않아도 알아서 JVM이 더 이상 필요 없는 객체를 처리하는 GC 작업과 finalization 작업을 실행한다.

JVM 종료
exit(int status) : 현재 수행중인 JVM을 멈춘다.
이 메소드를 사용하면 해당 애플리케이션의 JVM이 죽어버려 바로 장애로 직결된다.
넘어가는 매개 변수가 0일 경우에만 정상적인 종료를 의미하고, 그 외의 숫자는 비정상적인 종료를 의미한다.

------------------------------------------------------------------------------------------------------

5. 제네릭을 사용하는 가장 큰 이유는 무엇인지 정리해주세요.

Type 변환시에 발생할 수 있는 문제들을 사전에 없애기 위해서 사용한다.
어떤 Type을 매개 변수로 받아 사용할지 모르는 경우에 어떤 type을 받을 수 있도록 사용한다.
 
------------------------------------------------------------------------------------------------------

6. Set의 용도와 주요 클래스를 정리해 주세요.

Set은 데이터를 저장하는데 있어 순서가 중요하지 않을 때 주로 사용한다.
Java에서 Set interface를 구현한 주요 클래스는 HashSet, TreeSet, LinkedHashSet이 있다.

HashSet: 순서가 전현 필요 없는 데이터를 Hash tabl에 저장한다. Set 중에 가장 성능이 좋다.

TreeSet: 저장된 데이터의 값에 따라서 정렬되는 셋이다. red-black tree 타입으로 값이 저장되며, HashSet보다 약간 성능이 느리다.

LinkedHashSet: Linked list 타입으로 구현된 Hash table에 저장한다. 저장된 순서에 따라 값이 정렬된다. 성능이 샛 중 가장 나쁘다.

------------------------------------------------------------------------------------------------------

7. Set의 데이터를 하나씩 꺼내는 방법을 정리해 주세요.
 1) iterator 객체를 생성해 while문을 돌면서 Set의 데이터를 가져온다.
 2) for 루프를 이용 for( temp : set ){  }
 
------------------------------------------------------------------------------------------------------

8. ArrayList
