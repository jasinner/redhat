package com.redhat.gss.example.osgi.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.redhat.gss.example.osgi.time.TimeUtil.TimeZone;

public class Clock {
	TimeZone tz;
	

	public Clock(TimeUtil.TimeZone tz) {
		this.tz = tz;
		
	}

	public String getLocalTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
		switch (this.tz) {
		case BOSTON:
			java.util.TimeZone tzInBoston = java.util.TimeZone
					.getTimeZone("US/Eastern");
			sdf.setTimeZone(tzInBoston);
			return sdf.format(new Date());
		case PARIS:
			java.util.TimeZone tzInParis = java.util.TimeZone
					.getTimeZone("Europe/Paris");
			sdf.setTimeZone(tzInParis);
			return sdf.format(new Date());
		default: return sdf.format(new Date());
		}
	}
}
