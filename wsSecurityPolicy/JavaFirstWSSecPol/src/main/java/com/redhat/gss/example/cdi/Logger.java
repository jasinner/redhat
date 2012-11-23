package com.redhat.gss.example.cdi;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named
public class Logger {
	public void log(String mesg){
		System.out.println("***Logger: " + mesg);
	}
}
