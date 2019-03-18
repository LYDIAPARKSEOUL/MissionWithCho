package polymorphism;
public class InterfacePolymorphism {
	
    public static void main(String[] args) {
                    PRudia rudia = new PRudia();
                    KimHR kim = new PRudia();
                    ParkJS  park = new PRudia();
                    
                    // 인터페이스 1, 2를 구현한 클래스는 인터페이스1, 2의 메소드 모두 사용가능
                    rudia.eatSomething();
                    rudia.sing();
                    rudia.watch("나혼자 산다 ");
                    
                    // 인터페이스1의 기능만 사용하고 싶다면?
                    kim.sing();     // 인터페이스1 형으로 구현클래스의 인스턴스를 담아줘서 사용
                    
                    // 인터페이스2의 기능만 사용하고 싶다면?
                    park.eatSomething();  // 인터페이스2 형으로 구현클래스의 인스턴스를 담아줘서 사용
    }
}

interface KimHR{ // 인터페이스 1
    public void sing();  }

interface ParkJS{ // 인터페이스 2
    public void eatSomething();  }


class PRudia  implements KimHR, ParkJS { // 인터페이스 1,2 를 구현한 클래스
	    @Override
	    public void  eatSomething() { // 인터페이스 1 메소드 오버라이딩
	                    System.out.println("페레로로쉐 맛남 냠냠냠냠");
	    }
	    @Override
	    public void sing() { // 인터페이스 2 메소드 오버라이딩
	                    System.out.println(  "Para ~ Para~ Paradise ~ 오워아어오워어어" );
	    }
	    public void watch(String str) {
	                    System.out.println(  str+"을 본다능" );
	    }
}