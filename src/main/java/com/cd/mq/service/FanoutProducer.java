package com.cd.mq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FanoutProducer {
    @Autowired
    private AmqpTemplate amqpFanoutTemplate;
    public void sendDataToCrQueue(Object obj) {
    	amqpFanoutTemplate.convertAndSend(obj);
    }
}
