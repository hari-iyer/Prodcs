package com.ibytecode.businesslogic;

import javax.ejb.Remote;

@Remote
public interface HelloWorldBeanRemote {
public String sayhelloworld();
}
