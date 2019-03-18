package typeCasting.referenceCasting;
public class Son extends Daddy{
    public void help(String money) {
                    System.out.println("용돈주세요." + money + "만 주세염");
    }
    public static void saying(String str) {
                    if (str.equals("안된다.")) {
                                    System.out.println("헐...치사함");
                    } else {
                                    System.out.println("호 아버님 감사함당");
                    }
    }
}