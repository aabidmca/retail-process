package com.retailprocess.util;

import java.util.Date;

public class ApplicationUtil {
	
	public static long getUniqueId() {
		synchronized (ApplicationUtil.class) {
			return System.currentTimeMillis();
		}
	}
	
	public static int getCustomerDuration(Date registrationDate) {
		long diffInMillies = Math.abs(new Date().getTime() - registrationDate.getTime());
	    int years =  (int) (diffInMillies / (1000l * 60 * 60 * 24 * 365));
	    return years;
	}
}
