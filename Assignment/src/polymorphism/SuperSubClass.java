package polymorphism;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class SuperSubClass {
                public static void main(String[] args) {
                                
                                List<Integer> list = new ArrayList<>();
                                list.add(1); // ArrayList 의 add() 메소드
                                list.add(2);
                                list.add(10);
                                System.out.println(list);
                                
                                List<Integer> linkList = new LinkedList<>();
                                linkList.add(10); // LinkedList의 add() 메소드
                                linkList.add(20);
                                linkList.add(30);
                                System.out.println(linkList);
                }
}