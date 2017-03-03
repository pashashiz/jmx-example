package com.ps.jmx;


import javax.management.*;
import java.lang.management.ManagementFactory;

public class Application {

    public static void main(String[] args) throws Exception {
        starJMXServer();
        waitForEnterPressed();

    }

    private static void starJMXServer() throws Exception {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.ps.jmx:name=Test");
        server.registerMBean(new Test(), name);
    }

    private static void waitForEnterPressed() throws Exception {
        System.out.println("Press to continue...");
        System.in.read();
    }

}
