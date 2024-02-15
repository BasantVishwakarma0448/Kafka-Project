package com.endUser.config;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {

    @KafkaListener(topics = AppConstant.LOCATION_TOPIC_NAME, groupId = AppConstant.GROUP_ID)
    public void updatedLocation(String value){
        System.out.println(value);
    }
}
