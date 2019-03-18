package polymorphism;

public class OverloadingCastingTest1 {
	  public static void main(String[] args) {
		  OverloadingCastingTest1 test = new OverloadingCastingTest1();
          Typetester typeTest = new Typetester();
          
          String str = "1280000";
          int num = Integer.parseInt(str);
          System.out.println(num);
          String result = test.checkType(str);
          System.out.println(result);
          
          System.out.println("---------------");
          typeTest.printType(str);
}

		public String checkType(String str) {
		          String check = "틀림";
		          int a = 1280000;
		          String numToStr = Integer.toString(a);
		          if (str.equals(numToStr))
		                          check = "같음";
		          return check;
		}
}
class Typetester { // Type을 검사하기 위한 클래스
		void printType(byte x) {      // 메소드 오버로딩 이용해 타입비교
		          System.out.println(x + " is a byte");
		}
		void printType(int x) {
		          System.out.println(x + " is an int");
		}
		void printType(float x) {
		          System.out.println(x + " is a float");
		}
		void printType(double x) {
		          System.out.println(x + " is a double");
		}
		void printType(char x) {
		          System.out.println(x + " is a char");
		}
		void printType(String x) {
		          System.out.println(x + " is a String");
		}
}
