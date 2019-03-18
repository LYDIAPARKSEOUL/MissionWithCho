package delegationAndInheritance.inheritance;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InheritanceTest {
                public static void main(String[] args) {
                                String info = "";
                                Employees emp = null;
                                Programmers prgm = null;
                                
                                String name = null;
                                String age = null;
                                String position = null;
                                
                                BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
                                
                                try {
                                                System.out.println("이름을 입력하세요 => ");
                                                name = in.readLine();
                                                System.out.println("나이을 입력하세요 => ");
                                                age = in.readLine();
                                                System.out.println("직책을 입력하세요 => ");
                                                position = in.readLine();
                                } catch (Exception e) {
                                                System.out.println("입력을 다시해주세요. (오류발생)");
                                }
                                if (position.equals("개발자")) {
                                                emp = new Employees(name, age);
                                                info += emp.info();
                                } else {
                                                position =( position.equals("코더")) ? "너는 코더..!" : "너는 개발자..!";
                                                prgm = new Programmers(name, age, position);
                                                info += prgm.info() + prgm.addInfo(); //부모클래스 메소드 사용 info()
                                }
                                System.out.println(info);//
                }
}
