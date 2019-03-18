package delegationAndInheritance.delegation;
public class DelegationTest {
    public static void main(String[] args) {
                    WrappingChoco  wc = new WrappingChoco();
                    wc.makeNewChoco("화이트초콜렛");
                    wc.wrap(10);
    }
}
//클래스1에 기능을 사용하고 싶을 때 클래스2가 빌려와서 사용
class MakingChoco { // 클래스1
	    public void make(String choco) {
	                    System.out.println(choco + "를 만든당");
	    }
}
class WrappingChoco{ // 클래스2
	    // 클래스를 인스턴스화해서 빌려온다.
	    MakingChoco  mkchoco = new MakingChoco();
	    
	    public void wrap(int num ) {
	                    System.out.println(num + "개의 초코를 포장한다.");
	    }
	    public void makeNewChoco(String choco) {
	                    mkchoco.make(choco); // 위임
	    }
}