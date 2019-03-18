package delegationAndInheritance.inheritance;
public class Employees {// 부모클래스
    
    private String name;
    private int age;
    
    public Employees() {           }
    
    public Employees(String name, String age) {
                    this.name=name;
                    this.age=Integer.parseInt(age);
    }
    
    public String getName() { return name; }
    public void setName(String name) {this.name = name; }
    public int getAge() {return age; }
    public void setAge(int age) { this.age = age; }
    
    public String info() {
                    String info = "";
                    String age1= Integer.toString(age);
                    info += "이름  :  " + name + "\n";
                    info += "나이  :  " + "" + age1 + "\n";
                    return info;
    }
}