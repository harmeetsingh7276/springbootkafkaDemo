package com.kafka.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic personalTopic() {
        return TopicBuilder.name("personal").build();
    }

    @Bean
    public NewTopic personalJsonTopic() {
        return TopicBuilder.name("personal_json").build();
    }
}
