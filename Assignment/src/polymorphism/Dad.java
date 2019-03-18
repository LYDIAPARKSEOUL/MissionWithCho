package polymorphism;
/***
 * super 이용
 * super는 상위 클래스를 가리키는 레퍼런스 변수이다.객체가 생성될때 기본적으로 제공.
 * 이 변수를 이용하여 상위 클래스의 메소드와 변수에 접근이 가능,.
 * 이는 생략이 가능하나 상위와 하위에 같은 이름의 메서드가 있는 경우 구별해 준다.
 */
public class Dad {
                int age= 59;
                String name = "박아버님";
                
                public String daddySaying() {
                                String say = "상위메소드라능";
                                return say;
                }
}
class DDall extends Dad {
                int age = 29;
                public int whatMyAge() {
                                return this.age;
                }
                public int whatUrAge() {
                                return super.age; // 상위클래스 멤버변수 호출
                }
                public String whatDidUSaying() {
                                return super.daddySaying(); // 상위클래스 멤버메소드 호출
                }
}