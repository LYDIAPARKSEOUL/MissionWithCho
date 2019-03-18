package polymorphism;
/***
 * super();를 이용하면 상위클래스의 생성자를 호출할 수 있다.
 */
public class Mom {
                public Mom(String str) { // 상위클래스 생성자
                                System.out.println(str + " 알겠냐!!!");
                }
}
class Oppa extends Mom {
                public Oppa() { // 하위클래스 생성자
                                super("밥먹어!!"); // 상위클래스 생성자 호출
                }
}