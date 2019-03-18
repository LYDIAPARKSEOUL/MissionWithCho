package typeCasting.referenceCasting;
public class Test {
    public static void main(String[] args) {
                    Son son = new Son();
                    son.help("10만원");
                    Object obj = new Daddy();
                    Daddy dad = (Daddy) obj;
                    System.out.println("====");
                    
                    String str = (String) dad.saying();
                    son.saying(str);
                    System.out.println("====");
                    
                    String str2 = dad.sayingReal();
                    son.saying(str2);
                    System.out.println("====");
//                 Son adle = (Son) new Daddy(); // Son으로 캐스팅 불가
                    Daddy appa = (Daddy) son;
                    appa.sayingReal();
                    
                    System.out.println(appa.toString() ); // Son 참조값 @3d4eac69
                    System.out.println(son.toString() ); // Son 참조값 @3d4eac69
                    System.out.println(obj.toString() ); // Daddy 참조값 @42a57993
                    System.out.println( appa.getClass().getName() );
                    
                    System.out.println("----------");
                    Daddy dadTo = new Son(); 
//상위클래스  dadTo 에 하위클래스 인스턴스를 담아줌
                    Son s = (Son) dadTo; 
//하위클래스 인스턴스 객체에 dadTo라는 객체를 담고 Casting
//상위클래스와 하위클래스의 메소드를 모두 사용할 수 있는 객체 s
                    s.help("100원");
                    s.saying(); //Daddy (상위클래스)의 메소드
                    String daddySayingthat = (String) s.saying();
                    s.saying(daddySayingthat); // Son (하위클래스)의 메소드
    }
}