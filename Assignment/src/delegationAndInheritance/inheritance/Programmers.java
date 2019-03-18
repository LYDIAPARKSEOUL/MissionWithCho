package delegationAndInheritance.inheritance;
public class Programmers extends Employees { // 자식클래스
    
    private String position;
    public Programmers(String name , String age, String position) {
                    setName(name);
                    setAge(Integer.parseInt(age));
                    this.position = position;
    }
    
    public String addInfo() {
                    String info = "";
                    info += "직급  :  " + position + "\n";
                    return info;
    }
}