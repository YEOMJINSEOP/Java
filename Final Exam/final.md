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

8. ArrayList와 같은 List와 배열의 차이가 무엇인지 정리해주세요.

배열
- 고정된 크기를 갖는 같은 자료형의 원소들이 연속적인(논리적 저장 순서와 물리적 저장 순서가 일치) 형태로 구성된 자료구조
    인덱스에 따라 값을 유지하므로 원소가 삭제되어도 빈자리가 남게되어 메모리가 낭비된다.
    처음 크기를 10으로 지정한다면 5개의 데이터만 저장하더라도 실제 배열의 크기는 10이다.
        출처: https://jy-tblog.tistory.com/38 [jy.log:티스토리]

리스트
    배열의 문제점을 해결하기 위한 자료구조
    빈틈없는 데이터의 적재라는 장점을 가진다.
    원소를 삭제했을 때 삭제된 데이터 뒤 원소로 빈틈없이 연속적으로 위치시킨다.  
        출처: https://jy-tblog.tistory.com/38 [jy.log:티스토리]

------------------------------------------------------------------------------------------------------

9. Queue의 용도는 무엇이며, LinkedList의 특징이 무엇인지 정리해주세요.

Queue는 요청이 들어온 순서대로 처리할 때 큐를 사용한다.

LinkedList는 데이터의 삽입과 삭제가 효율적이다. 하지만, 데이터를 검색할 때에는 비효율적이다.

------------------------------------------------------------------------------------------------------

10. Map의 용도와 주요 클래스를 정리해 주세요.

Map은 key와 value로 데이터를 저장한다. key를 활용해 원하는 value를 빠르게 찾을 수 있다.

주요 클래스
HashMap: provides all of the optional map operations, and permits null values and the null key. 
TreeMap: A Red-Black tree based NavigableMap implementation. 키를 저장하는 동시에 키를 정렬한다. 정렬되는 순서는 "숫자 > 대문자 > 소문자 > 한글"
LinkedHashMap 

------------------------------------------------------------------------------------------------------
11. Arrays 클래스의 주요 용도는 무엇인지 정리해 주세요.

배열들을 조작하기 위한 다양한 메소드를 포함하고 있다.
------------------------------------------------------------------------------------------------------
12. StringTokenizer 클래스의 용도는 무엇인지 정리해 주세요.
String을 Token화 시킨다.

The following is one example of the use of the tokenizer. The code:

     StringTokenizer st = new StringTokenizer("this is a test");
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }
 
prints the following output:

     this
     is
     a
     test
     
------------------------------------------------------------------------------------------------------
13. Thread 클래스를 확장한 클래스를 구현할 때 항상 만들어야 하는 메소드는 무엇인가요? 접근 제어자, 리턴 타입, 메소드 이름을 적어주세요.
public void run()
------------------------------------------------------------------------------------------------------
14. Thread 클래스와 Runnable 인터페이스를 구현해 만든 쓰레드를 실행하려면 각각 어떻게 해야 하는지 정리해 주세요.
    new Thread().start()
    thread.start()
    
------------------------------------------------------------------------------------------------------
15.Synchronized에 대해서 정리해 주세요.
여러 쓰레드가 동시에 같은 객체를 참조할 때, 한 쓰레드가 한 객체에 대해 실행 중이면 다른 쓰레드는 접근 할 수 없다.
------------------------------------------------------------------------------------------------------
16. InputStream 클래스의 용도는 무엇이고, Reader 클래스와 어떤 점이 다른지 정리해 주세요.
데이터를 받을 때 사용한다. InputStream은 byte를 받아오는 반면, Reader 클래스는 String을 받아온다.
------------------------------------------------------------------------------------------------------
17. 클래스 선언시 Serializable을 구현하는 이유는 무엇인지 정리해 주세요.
생성한 객체를 파일로 저장하거나, 저장한 객체를 읽을 때 또는 객체를 다른 서버에 보내거나 다른 서버로부터 객체를 받을 때 꼭 필요한 것이 Serializable이다. 특정 클래스를 위의 기능이 가능하게 하려면 이 interface를 반드시 implement 해야한다.
------------------------------------------------------------------------------------------------------
18. transient로 선언한 변수는 다른 변수와 어떻게 다른지 정리해 주세요.
데이터 전송시 해당 변수는 전송되지 않는다. 비밀번호와 같이 변수는 분명히 존재하지만, 보안상의 이유로 전송을 원치 않을 때 transient 변수를 사용한다.
------------------------------------------------------------------------------------------------------
19. TCP 통신을 처리하기 위해서 사용하는 클래스는 무엇인지 정리해 주세요.
ServerSocket 클래스: 서버에서 데이터를 받기 위해 사용하는 클래스
Socket 클래스: 데이터를 보내는 쪽(보통 클라이언트)에서 객체를 생성해 사용한다.
데이터를 받는 쪽(보통 서버)에서 클라이언트 요청을 받으면, 요청에 대한 Socket 객체를 생성해 데이터를 처리한다. 즉, Socket 클래스는 원격에 있는 장비와의 연결 상태를 보관하고 있다.

------------------------------------------------------------------------------------------------------
20. UDP 통신을 처리하기 위해서 사용하는 클래스는 무엇인지 정리해 주세요.
DatagramSocket 클래스: 데이터를 보내는 역할과 받는 역할을 모두 수행하는 클래스
DatagramPacket 클래스: TCP에서는 stream 객체를 얻어 데이터를 주고 받았지만, UDP 통신을 할 때에는 steam을 사용하지 않고 DatagramPacket 클래스를 사용한다. 
