package delegationAndInheritance;
public class InheritanceAndDelegationTest {
    public static void main(String[] args) {
                    RussianBlue  rs = new RussianBlue();
                    rs.eat("생선");
                    
                    Munchkin  mc = new Munchkin();
                    mc.eat("마카롱");
                    mc.eatBR(new RussianBlue(), "물"); // 위임
    }
}