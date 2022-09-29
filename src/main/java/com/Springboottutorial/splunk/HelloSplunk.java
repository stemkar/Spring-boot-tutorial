package com.Springboottutorial.splunk;

import com.splunk.Args;
import com.splunk.Receiver;
import com.splunk.Service;

import java.util.HashMap;
import java.util.Map;

public class HelloSplunk {

    public static void main(String[] args) {

        System.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");

        Map<String, Object> connectionAgrs = new HashMap<String, Object>();
        connectionAgrs.put("host", "127.0.0.1");
        connectionAgrs.put("username", "admin");
        connectionAgrs.put("password", "MJavaProgram");
        connectionAgrs.put("port", 8000);
        connectionAgrs.put("scheme", "https");
        Service splunkService = Service.connect(connectionAgrs);
        Receiver receiver = splunkService.getReceiver();

        Args logArgs = new Args();
        logArgs.put("sourcetype", "hellosplunk");
        receiver.log("main",logArgs,"Hello Splunk Event ");
    }
}
