package com.ibytecode.clientutility;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class clientutility {
private static Context initialContext;
private final static String PKG_INTERFACES = "org.jboss.ejb.client.naming";

public static Context getInitialContext() throws NamingException {
    if (initialContext == null) {
       // Properties properties = new Properties();
       // properties.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);

        initialContext = new InitialContext();
    }
    return initialContext;
}


}
