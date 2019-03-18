package collection.list;
public class PersonInfo {
    private String firstName;
    private String  lastName;
    private String  homeAddr;
    
    public PersonInfo() {  }
    
    public PersonInfo(String firstName, String lastName, String homeAddr) {
                    super();
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.homeAddr = homeAddr;
    }
    public String getFirstName() {  return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() {           return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getHomeAddr() { return homeAddr; }
    public void setHomeAddr(String homeAddr) {             this.homeAddr = homeAddr; }
}