package abstraction.innerClass;
public class Inner03 {
    // 지역클래스  ; 메소드 안에서 수행되는 내부클래스
    public void  sayMyType() {
                    class SingerA{
                                    public String singerType(String str) {
                                                    return str + " 님 짱짱좋아염";
                                    }
                    }
                    // 내부클래스 객체생성해서
                    // 내부클래스 메소드로 syso 출력
                    SingerA  singer = new SingerA();
                    String type = singer.singerType("유지태");
                    System.out.println(type);
    }
    public static void main(String[] args) {
                    Inner03 i3 = new Inner03();
                    i3.sayMyType();
                    // 메소드 호출하면 그 안에 내부클래스 내용이 실행된다.
    }
}