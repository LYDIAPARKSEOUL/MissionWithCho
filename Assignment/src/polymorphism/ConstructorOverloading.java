package polymorphism;
public class ConstructorOverloading {
    public static void main(String[] args) {
                    
                    RudiRudi  rudi1 = new RudiRudi(); // 디폴트생성자
                    RudiRudi  rudi2 = new RudiRudi("루디짱"); // 생성자1
                    RudiRudi  rudi3 = new RudiRudi(29, "거의 계란한판 박루디아");
                    RudiRudi  rudi4 = new RudiRudi(300);
                    
                    rudi1.print(rudi1);   // 30살 먹은 호빵이
                    rudi2.print(rudi2);   // 0살 먹은 루디짱   -> String만 넣어줌
                    rudi3.print(rudi3);   // 29살 먹은 거의 계란한판 박루디아
                    rudi4.print(rudi4);   // 300살 먹은 null -> int만 넣어줌
    }
}