package com.redhat.gss.wss.policy.jaas;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.interceptor.security.SimpleAuthorizingInterceptor;

public class POJOEndpointAuthorizationInterceptor extends SimpleAuthorizingInterceptor{
	   public POJOEndpointAuthorizationInterceptor()
	   {
	      super();
	      readRoles();
	   }
	 
	   private void readRoles()
	   {
	      //just an example, this might read from a configuration file or such
	      Map<String, String> roles = new HashMap<String, String>();
	      roles.put("sayHello", "friend");
	      roles.put("greetMe", "snoopies");
	      setMethodRolesMap(roles);
	   }
}
