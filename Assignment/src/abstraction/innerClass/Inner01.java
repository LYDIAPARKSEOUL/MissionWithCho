package abstraction.innerClass;

public class Inner01 {
    // Inner01 클래스 안에 내부클래스 Calculator01
    class Calculator01 {
                    public int sum = 0;
                    public int add() {
                                    sum ++;
                                    return sum;
                    }
    }
    public static void main(String[] args) {
                    Inner01 i01 = new Inner01();
                    Inner01.Calculator01 cal = i01.new Calculator01();
                    // 생성된 외부클래스 인스턴스에 내부클래스 인스턴스화
                    cal.add();
                    cal.add();
                    int a = cal.add();
                    System.out.println(a);
    }
}