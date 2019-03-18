package typeCasting.primitiveTypeCasting;
public class StringIntegerCasting {
    public static void main(String[] args) {
                    String num1 = "123";
                    String num2 = "23";
                    
                    int a1 = Integer.parseInt(num1);
                    int a2 = Integer.parseInt(num2);
                    
                    String s1 = Integer.toString(a1);
                    String s2 = Integer.toString(a2);
                    
                    int num3 = a1 -a2;
                    String str = s1 + s2;
                    System.out.println(a1 + " - " +a2 +" = " + num3 );
                    System.out.println(s1 + " + " +s2 +" = " + str );
    }
}