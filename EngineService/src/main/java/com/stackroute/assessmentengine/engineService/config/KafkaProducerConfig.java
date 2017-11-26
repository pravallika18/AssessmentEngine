package com.stackroute.assessmentengine.engineService.config;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.stackroute.assessmentengine.engineService.domain.Question;
import com.stackroute.assessmentengine.engineService.domain.QuestionBean;
import com.stackroute.assessmentengine.engineService.message.KafkaProducer;


@Configuration
public class KafkaProducerConfig {

  @Value("${kafka.bootstrap-servers}")
  private String bootstrapServers;

  @Bean
  public Map<String, Object> producerConfigs() {
    Map<String, Object> props = new HashMap<>();
    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

    return props;
  }

  @Bean
  public ProducerFactory<String, Question> producerFactory() {
    return new DefaultKafkaProducerFactory<>(producerConfigs());
  }

  @Bean
  public KafkaTemplate<String, Question> kafkaTemplate() {
    return new KafkaTemplate<>(producerFactory());
  }
  @Bean
  public ProducerFactory<String, QuestionBean> producerFactory1() {
    return new DefaultKafkaProducerFactory<>(producerConfigs());
  }

  @Bean
  public KafkaTemplate<String, QuestionBean> kafkaTemplate1() {
    return new KafkaTemplate<>(producerFactory1());
  }

  @Bean
  public KafkaProducer sender() {
    return new KafkaProducer();
  }
}
