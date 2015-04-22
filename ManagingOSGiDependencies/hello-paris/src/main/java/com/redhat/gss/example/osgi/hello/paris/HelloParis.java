package com.redhat.gss.example.osgi.hello.paris;

import com.redhat.gss.example.osgi.time.Clock;

public interface HelloParis {
    public String getGreeting();
    
    public Clock getLocalTime();
}
