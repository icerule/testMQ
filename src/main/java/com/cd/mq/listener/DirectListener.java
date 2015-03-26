package com.cd.mq.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class DirectListener implements  MessageListener{
    public void onMessage(Message message) {
    	System.out.println("cache data from DirectListener :" +new String(message.getBody()));
    }
}
