package com.redhat.gss.example.osgi.hello.boston.impl;

import com.redhat.gss.example.osgi.hello.boston.HelloBoston;

import com.redhat.gss.example.osgi.time.Clock;
import com.redhat.gss.example.osgi.time.TimeUtil;

public class HelloBostonImpl implements HelloBoston {
    protected Clock localTime = null;

    public String getGreeting() {
        return new String("Hello!");
    }

    public Clock getLocalTime() {
        if (localTime==null) {
            localTime = TimeUtil.createClock(TimeUtil.TimeZone.BOSTON);
        }
        return localTime;
    }

}
