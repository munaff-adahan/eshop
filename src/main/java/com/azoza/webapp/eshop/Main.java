package com.azoza.webapp.eshop;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

        Context context = tomcat.addWebapp("/eshop", new File("./src/main/webapp").getAbsolutePath());
        context.setAllowCasualMultipartParsing(true);

        tomcat.start();
    }
}
