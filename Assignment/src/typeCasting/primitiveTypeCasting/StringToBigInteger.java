package typeCasting.primitiveTypeCasting;
import java.math.BigInteger;
public class StringToBigInteger {
                public static void main(String[] args) {
                                
                                String msg = "간장게장 김수미짱짱";
                                BigInteger bi = new BigInteger(msg.getBytes());
                                System.out.println(bi); // String to  BigInteger
                                System.out.println(new String(bi.toByteArray()));// BigInteger to String
//                               String  -----------------> byte[] ------------------> BigInteger
//                                       String.getBytes()         BigInteger(byte[])
                                
//                                BigInteger ------------------------> byte[] ------------------> String
//                                            BigInteger.toByteArray()          String(byte[])
                }
}