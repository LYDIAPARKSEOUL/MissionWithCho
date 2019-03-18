package typeCasting.primitiveTypeCasting;
public class PrimitiveTypeCastingTest {
    public static void main(String[] args) {
                    System.out.println("short MAX_VALUE : " + Short.MAX_VALUE);
                    short s = 100;
                    int i = s ;  // 확장변환의 경우 자동변환
                    System.out.println(  "int i = " + i  );
                    
                    int num = 1;
//                 short sh = num; // 축소변환의 경우에는 컴파일 에러 뜬다.
                    // 타입의 데이터 크기가 작아지는 변환의 경우는 호환성이 없기 떄문에
                    // 자동적으로 변환할 수 없어 컴파일에러가 뜬다.
                    
                    int num2 = 32767 + 1; // short 범위보다 1 더 큰 int값
//                 short ss = num2; // short 타입으로 축소변환시 컴파일에러
                    
                    int i1 = (int) 103.20F;
                    System.out.println(i1);
                    
    }
}