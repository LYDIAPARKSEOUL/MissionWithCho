package com.assignment2.rudia.jUnitTest;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
public class JUnitTest {

	@Test
	@Ignore
	public void testSum() {
		Calculator01 c = new Calculator01();
		double result = c.sumResult(30.0, 22.0);
		assertEquals(52.0, result, 0); // success
		assertEquals(52, result, 0);    // success
		assertEquals(51.0, result, 0);// failure 
//		JUnit 프레임워크에의 Assert 클래스의 정적 메서드인 assertEquals를 이용하여 테스트 결과 값을 확인한다. 
//		assertEquals(expected, actual, delta)는 assertEquals(예상값, 실제값, 허용오차)
	}
}
/**
 * 
 * . JUnit 3에서는 TestCase클래스를 상속받아 사용해야 했으나 JUnit 4에서는 상속받지 않아도 된다.
 *   @Test 어노테이을 선언하여 testSum 메서드가 단위 테스트 메서드임을 선언한다.
 *   Calcurator 클래스의 인스턴스를 선언 후 인자값을 세팅하여 result변수에 결과값을 리턴받는다.
 */


