package com.cd.mq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectProducer {
    @Autowired
    private AmqpTemplate amqpDirectTemplate;
    public void sendDataToCrQueue(Object obj) {
    	amqpDirectTemplate.convertAndSend("test_direct_key", obj);
    }
}
