package com.cd.action.msg;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.cd.mq.service.DirectProducer;
import com.cd.mq.service.FanoutProducer;
import com.cd.mq.service.TopicProducer;

@Controller
@RequestMapping(value="/msg")
public class MessageController {
    @Resource
    private DirectProducer directProducer;
    @Resource
    private TopicProducer topicProducer;
    @Resource
    private FanoutProducer fanoutProducer;
    private static Log log = LogFactory.getLog(MessageController.class);

    @RequestMapping("/producer/direct")
    public String producerDirect() throws Exception {
    	log.info("msg producerDirect start");
    	for(int i=0;i<1;i++){
    		directProducer.sendDataToCrQueue("data"+i);
		}

        return "index";
    }

    @RequestMapping("/producer/topic")
    public String producerTopic() throws Exception {
    	log.info("msg producerTopic start");
    	for(int i=0;i<1;i++){
    		topicProducer.sendDataToCrQueue("data"+i);
		}

        return "index";
    }

    @RequestMapping("/producer/fanout")
    public String producerFanout() throws Exception {
    	log.info("msg producerFanout start");
    	for(int i=0;i<1;i++){
    		fanoutProducer.sendDataToCrQueue("data"+i);
		}

        return "index";
    }
}
