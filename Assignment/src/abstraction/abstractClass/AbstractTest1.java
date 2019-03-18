package abstraction.abstractClass;
public class AbstractTest1 {
    public static void main(String[] args) {
                    Purple  p1 = new Purple(); // 클래스1 객체생성
                    p1.color();
                    
                    SkyPurple  p2 = new SkyPurple(); // 클래스2 객체생성
                    p2.color();
                    
                    Violet p3 = new Violet() {
                                    @Override
                                    public void color() {  // 추상클래스의 메소드 재정의
                                                    System.out.println("바이올렛 컬러");
                                    }
                    };
                    p3.color();
    }
}
//추상메소드를 포함하는 클래스 => 추상클래스
abstract class Violet{
    public abstract void color() ;
    public void sayColor() {
                    System.out.println("일반 메소드");
    }
}
//추상클래스를 상속받는 클래스1
class Purple extends Violet {
    @Override
    public void color() {
                    System.out.println("보라색");
    }
}
//추상클래스를 상속받는 클래스2
class SkyPurple extends Violet {
    @Override
    public void color() {
                    System.out.println("푸른보라색");
    }
}