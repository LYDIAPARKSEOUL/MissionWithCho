package com.assignment2.rudia;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestAssert {
	
	int a = 10;
	int b = 20 - 10;
	String null1 = null;
	
	// @Test(timeout=5000) // 메소드 수행시간 제한
	@Test(expected=RuntimeException.class)  // 여기서는 failure
	// Exception Test; RuntimeException 발생시 success 뜬다.
	//	@Ignore  // 해당 메소드는 단위테스트 진행 안함
	public void test() {
		assertEquals(a, b); // success
		assertSame(a, b);  // success
		assertNull(null1);  // success
	}
}
