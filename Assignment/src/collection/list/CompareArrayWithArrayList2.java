package collection.list;
public class CompareArrayWithArrayList2 {
    public static void main(String[] args) {
                    PersonInfo[] p1 = new PersonInfo[3];             // 배열
                    String str= "루디아";
                    String strLast= "빡";
                    String home= "상도동 헬스장";
                    for (int i = 0; i < p1.length; i++) {
                                    PersonInfo p = new PersonInfo(); // 객체생성해주고 setting
                                    p.setFirstName("[" +i +"]번째 "+str);
                                    p.setLastName("[" +i +"]  "+strLast + i);
                                    p.setHomeAddr("[" +i +"]번지 "+home);
                                    p1[i] = p; // 객체로 만든 것들을 배열 p1에 인덱스에 맞춰서 넣어준다.
                    }
                    for (int i = 0; i < p1.length; i++) {
                                    // 배열의 값을 불러올 때엔 인덱스 번호를 통해서 불러 올 수 있음.
                                    System.out.println(p1[i].getFirstName());
                                    System.out.println(p1[i].getLastName());
                                    System.out.println(p1[i].getHomeAddr());
                                    System.out.println();
                    }
                    p1[4].setFirstName("루디아");
    }
}
