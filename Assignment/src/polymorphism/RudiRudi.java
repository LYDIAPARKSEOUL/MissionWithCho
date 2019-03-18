package polymorphism;
public class RudiRudi {
	    String name;
	    int age ;
	    
	    /***
	     *  this. 의 개념
	     *  객체 생성시 그 객체자신을 말함
	     *  this.name ; 생성된 객체의 name이라는 변수
	     *  this.age ; 생성된 객체의 age라는 변수
	     */
	    
	    public RudiRudi() {                // 디폴트 생성자
	                    this.name = "호빵이";   // 디폴트값으로 name과 age 설정해줌
	                    this.age = 30;
	    }
	    public RudiRudi(String name) { // String만 받는 생성자1
	                    this.name = name;
	    }
	    public RudiRudi(int age, String name) { // String, int 받는 생성자2
	                    this.age = age;
	                    this.name = name;
	    }
	    public RudiRudi(int age) { // int만 받는 생성자3
	                    this.age = age;
	    }
	    public void print(RudiRudi  rudi) { // 생성자 정보 출력을 위한 메소드
	                    System.out.println(rudi.age +"살 먹은 "+ rudi.name);
	    }
}