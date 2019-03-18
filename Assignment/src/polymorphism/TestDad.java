package polymorphism;
public class TestDad {
    public static void main(String[] args) {
                    DDall rudia = new DDall();
                    System.out.println(rudia.daddySaying());
                    System.out.println(rudia.whatDidUSaying());
                    int a = rudia.whatUrAge();
                    System.out.println("울아빠님 " + a+"세");
                    int b = rudia.whatMyAge();
                    System.out.println("루디아는 " + b+"세");
                    Oppa park = new Oppa(); // 생성자는 객체 생성시
                    System.out.println(park.getClass().getSimpleName());
    }
}