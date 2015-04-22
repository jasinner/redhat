package com.redhat.gss.example.osgi.time;

public class TimeUtil {
	public enum TimeZone {
		BOSTON, PARIS
	}

	public static Clock createClock(TimeZone tz) {
		return new Clock(tz);
	}
}