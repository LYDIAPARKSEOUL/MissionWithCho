package collection.list;
import java.util.ArrayList;
import java.util.Iterator;
public class CompareArrayWithArrayList1 {
                public static void main(String[] args) {
//                             컬렉션에 들어가는 형Type을 지정해줘서 String만 들어가게끔 타입을 제한
                                ArrayList<String> pi = new ArrayList<String>();
                                pi.add("유지태");
                                pi.add("정우성");
                                pi.add("박보검");
                                
//                              인덱스를 통한 조회방법
                                String ele01 = pi.get(0).toString();
                                String ele02 = pi.get(1).toString();
                                String ele03 = pi.get(2).toString();
                                
                                System.out.println(" \n- - - - - - - -  - - - - - - 인덱스를 통한 조회방법");
                                System.out.println("이상형 랭킹 : " + ele01 + ", "+ ele02+ ", "+ele03);
                                
//                              향상된for문 통한 전체조회
                                System.out.println(" \n- - - - - - - -  - - - - - -향상된for문 통한 전체조회");
                                int index= 1;  // index 번호 부여하는것처럼 순서 출력하기 위해 생성
                                for (String idealType : pi) {
                                                System.out.println("이상형 순위는?"+index++ +"위 : " + idealType );
                                }
                                
                                System.out.println(" \n- - - - - - - -  - - - - - - Iterator 를 통한 전체조회");
//                              Iterator 를 통한 전체조회
                                Iterator<String> iterator = pi.iterator();
                                while(iterator.hasNext()) {
                                                String element = (String ) iterator.next();
                                                System.out.println(element);
                                }
                                System.out.println(" \n- - - - - - - -  - - - - - - 메소드 활용");
//                             contains ; 존재여부 확인
//                             indexOf   ; 배열순서확인
//                             set(int index,Obect obj) ; 주어진 위치에 주어진값이 저장
//                             size()  ; List 크기
                                                System.out.println("이상형 중에 유지태가 있는가? " + pi.contains("유지태") + "// contains ; 존재확인");
                                                System.out.println("유지태는 몇번째 이상형 ? " + (pi.indexOf("유지태") + 1) + "번째 // indexOf ; 배열순서확인");
                                                System.out.println("순위 : " + pi.size() + "개");
                                pi.set(2, "디카프리오");
                                                System.out.println("이상형 3위는? " + pi.get(2));
                                pi.add("베네딕트컴버베치"); // ArrayList는 계속해서 추가 가능
                                System.out.println("이상형 4위는? " + pi.get(3));
                }
}