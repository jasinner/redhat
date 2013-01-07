package com.redhat.gss.example.jersey;

import javax.ws.rs.ApplicationPath;

import com.sun.jersey.api.core.PackagesResourceConfig;

@ApplicationPath("/")
public class MyApplication extends PackagesResourceConfig {
	public MyApplication() {
		super("com.sun.jersey.samples.helloworld.resources");
	}

}
