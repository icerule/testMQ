package com.cd.mq.listener;

public class TopicListener{

	public void listenarticle(String msg) {
        System.out.println("cache data from TopicListener listenarticle:"+msg);
    }

	public void listenbid(String msg) {
        System.out.println("cache data from TopicListener listenbid:"+msg);
    }

	public void listencategory(String msg) {
        System.out.println("cache data from TopicListener listencategory:"+msg);
    }

	public void listendog(String msg) {
        System.out.println("cache data from TopicListener listendog:"+msg);
    }

}
