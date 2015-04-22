package com.redhat.gss.example.osgi.hello.boston;

import com.redhat.gss.example.osgi.time.Clock;

public interface HelloBoston {
    public String getGreeting();
    
    public Clock getLocalTime();
}
