package polymorphism;
public class SuperSubOverridingTest {
	
    public static void main(String[] args) {
                    Rudia rudi = new Rudia();
                    Rudia  rudipet1 = new RudiPet1();  // 서브클래스1 인스턴스 생성해서 rudi에 담음
                    Rudia  rudipet2 = new RudiPet2();  // 서브클래스2 인스턴스 생성해서 rudi에 담음
    
                    rudi.eating("콩"); //콩 먹고싶다.
                    rudi.saying();      //반육십 다되는 내나이는 29
                    
                    rudipet1.eating("빵");  //빵좀 그만먹어요 주인님
                    rudipet1.saying();     //왈왈 나는 강아지
                    
                    rudipet2.eating("떡");    //떡좀 먹으면 어떠냐 야옹
                    rudipet2.saying();       //냐옹 냐옹 심심하다냐옹
                    
                    //rudipet2.grwwgrww();
                    // 데이터 형이 Rudia 이므로 RudiPet2안에 오버라이딩 된 거 제외 메소드 사용불가
                    // 사용하려면 형변환 해줘야 함.
                    RudiPet2 diapet2 = (RudiPet2) rudipet2;
                    diapet2.grwwgrww("햇살이 참 좋당");   //햇살이 참 좋당 그롱그롱 야옹야옹
    }
}

class Rudia { // 슈퍼클래스
		public int age = 29;
		
		public void  eating(String str) {
		    System.out.println(str + " 먹고싶다.");
		}
		public void  saying() {
		    System.out.println( "반육십 다되는 내나이는 " + Integer.toString(age) );
		}
}

class RudiPet1 extends Rudia {  // 서브클래스 1 ; 강아지
		public void eating(String str) { // 오버라이딩
		    System.out.println( str + "좀 그만먹어요 주인님" );
		}
		public void saying() {
		    System.out.println(  "왈왈 나는 강아지" );
		    return;
		}
		public void saying(String str) {
		    System.out.println( str+"을 사주세염 왈왈"  );
		}
 }
		
class RudiPet2 extends Rudia {  // 서브클래스 2 ; 고양이
		public void eating(String str) { // 오버라이딩
		    System.out.println( str + "좀 먹으면 어떠냐 야옹" );
		}
		public void saying() {
		    System.out.println(  "냐옹 냐옹 심심하다냐옹" );
		    return;
		}
		public void grwwgrww(String str) {
		    System.out.println( str+" 그롱그롱 야옹야옹"  );
		}
}
