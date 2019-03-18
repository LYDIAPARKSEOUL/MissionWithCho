package abstraction;
public class DelegationTest  implements SingingA, DancingA, HavingLunchA{
    // 사용하고 싶은 기능이 있는 인터페이스 들을 구현
    @Override
    public void eating(String lunch) {
                    System.out.println(lunch + "를 먹어보아염");
    }
    @Override
    public void dance() {
                    System.out.println("둠칫 춤을 춘다능");
    }
    @Override
    public void sing(String str) {
                    System.out.println(str + "를 부르는 루디");
    }
    public static void main(String[] args) {
                    // 인스턴스 객체를 생성해서 메소드 호출
                    DelegationTest  dd = new DelegationTest();
                    dd.eating("샌드위치랑 치즈핫도그");
                    dd.dance();
                    dd.sing("김광진의 편지");
    }
}