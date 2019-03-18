package abstraction.innerClass;
public class Inner02 {
    static class AbInner02 { // 선언부에 static 키워드 ; 정적내부클래스
                    public String name;
                    public String sayUrName(String name) {
                                    return name + "입니당";
                    }
    }
    public static void main(String[] args) {
                    Inner02.AbInner02 obj = new Inner02.AbInner02();
                    // 내부클래스 객체 선언안해도 외부클래스의 객체만으로
                    // new 외부Class.내부Class만으로 메소드 호출이 가능하다.
                    String str = obj.sayUrName("박루디아");
                    System.out.println(str);
    }
}