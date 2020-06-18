package com.maoge.demo;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;

public class ProducerDemo {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("group1");
        producer.setNamesrvAddr("127.0.0.1:9876");
        Message msg = new Message("01_test", "TagA", "0001", "hello".getBytes());
        producer.start();
        producer.send(msg);
        producer.shutdown();
    }
}
