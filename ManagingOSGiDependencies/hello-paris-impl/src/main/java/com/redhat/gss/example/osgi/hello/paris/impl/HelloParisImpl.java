package com.redhat.gss.example.osgi.hello.paris.impl;

import com.redhat.gss.example.osgi.hello.paris.HelloParis;
import com.redhat.gss.example.osgi.time.Clock;
import com.redhat.gss.example.osgi.time.TimeUtil;

public class HelloParisImpl implements HelloParis {
    protected Clock localTime = null;

    public String getGreeting() {
        return new String("Bonjour!");
    }

    public Clock getLocalTime() {
        if (localTime==null) {
            localTime = TimeUtil.createClock(TimeUtil.TimeZone.PARIS);
        }
        return localTime;
    }

}
