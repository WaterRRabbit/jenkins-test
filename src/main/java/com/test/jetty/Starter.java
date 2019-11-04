package com.test.jetty;

import com.test.jetty.handler.HelloJettyHandler;
import org.eclipse.jetty.server.Server;

public class Starter {

    public static void main(String[] args) {
        Server server = new Server(9999);
        try {
            server.setHandler(new HelloJettyHandler());
            server.start();
            server.join();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
