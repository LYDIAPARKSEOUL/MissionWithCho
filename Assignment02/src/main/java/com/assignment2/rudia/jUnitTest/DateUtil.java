package com.assignment2.rudia.jUnitTest;

import java.util.Calendar;

public class DateUtil {
	public static String getCurrentTime() {
		StringBuffer sb = new StringBuffer();
		Calendar  cal = Calendar.getInstance();
		
		sb.append(cal.get(Calendar.YEAR));
		sb.append(String.format("%02d", cal.get(Calendar.MONTH) + 1));
		sb.append(String.format("%02d", cal.get(Calendar.DATE)));
		return sb.toString();
	}
}
