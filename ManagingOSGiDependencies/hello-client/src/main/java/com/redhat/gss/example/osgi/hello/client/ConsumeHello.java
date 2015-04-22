package com.redhat.gss.example.osgi.hello.consumer;

import com.redhat.gss.example.osgi.hello.boston.HelloBoston;
import com.redhat.gss.example.osgi.hello.paris.HelloParis;

public class ConsumeHello {
    protected HelloBoston helloBoston = null;
    protected HelloParis helloParis = null;
    
    public void init() {
        if (helloBoston==null || helloParis==null) {
            System.out.println("Initialization failed. Injected objects are null.");
            return;
        }
        
        String enGreeting = helloBoston.getGreeting();
        String bostonTime = helloBoston.getLocalTime().getLocalTime();
        System.out.println("Boston says:" + enGreeting + " at " + bostonTime);
        
        String frGreeting = helloParis.getGreeting();
        String parisTime = helloParis.getLocalTime().getLocalTime();
        System.out.println("Paris says:" + frGreeting + " at " + parisTime);
    }

    public HelloBoston getHelloBoston() {
        return helloBoston;
    }

    public void setHelloBoston(HelloBoston helloBoston) {
        this.helloBoston = helloBoston;
    }

    public HelloParis getHelloParis() {
        return helloParis;
    }

    public void setHelloParis(HelloParis helloParis) {
        this.helloParis = helloParis;
    }
    
}
