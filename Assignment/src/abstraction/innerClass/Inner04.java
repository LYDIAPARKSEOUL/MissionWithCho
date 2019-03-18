package abstraction.innerClass;
public class Inner04 {
    // 메소드 인자로 인터페이스를 받는다
    public void checkTrees(Trees t) {
                    System.out.println(t.name("플라타너스"));
                    System.out.println(t.height(180));
    }
    
    public static void main(String[] args) {
                    // 클래스의 객체 생성
                    Inner04 i4 = new Inner04();
                    // 인스턴스를 이용해 인터페이스를 구현하는 익명클래스
                    i4.checkTrees(new Trees() {
                                    @Override
                                    public String name(String name) {
                                                    return name + " 너무나 아름다운 나무!";
                                    }
                                    @Override
                                    public float height(int hw) {
                                                    return hw / 100f;
                                    }
                    });
    }
}