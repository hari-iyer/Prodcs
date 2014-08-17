package com.ibytecode.businesslogic;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
public class HelloWorldBean implements HelloWorldBeanRemote, HelloWorldBeanLocal {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {}
        // TODO Auto-generated constructor stub
    	public String sayhelloworld()
    	{
    		return "hello world";
    	}
    

}
