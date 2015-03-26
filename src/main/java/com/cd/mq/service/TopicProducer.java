package com.cd.mq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicProducer {
    @Autowired
    private AmqpTemplate amqpTopicTemplate;
    public void sendDataToCrQueue(Object obj) {
    	amqpTopicTemplate.convertAndSend("test.topic.article.ddd", obj);
    	amqpTopicTemplate.convertAndSend("test.topic.b.aaa", obj);
    	amqpTopicTemplate.convertAndSend("test.topic.c.bbb", obj);
    	amqpTopicTemplate.convertAndSend("test.topic.dog.ccc", obj);
    }
}
