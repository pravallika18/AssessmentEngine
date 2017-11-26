package com.stackroute.assessmentengine.engineService.config;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;

import org.apache.kafka.common.serialization.StringDeserializer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.stackroute.assessmentengine.engineService.domain.Question;
import com.stackroute.assessmentengine.engineService.domain.QuestionBean;
import com.stackroute.assessmentengine.engineService.message.KafkaConsumer;


@Configuration
public class KafkaConsumerConfig {

	@Value("${kafka.bootstrap-servers}")
	  private String bootstrapServers;

	  @Bean
	  public Map<String, Object> consumerConfigs() {
	    Map<String, Object> props = new HashMap<>();
	    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
	    props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	    props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
	    props.put(ConsumerConfig.GROUP_ID_CONFIG, "json");

	    return props;
	  }

	  @Bean
	  public ConsumerFactory<String, QuestionBean> consumerFactory1() {
	    return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(),
	        new JsonDeserializer<>(QuestionBean.class));
	  }

	  @Bean
	  public ConcurrentKafkaListenerContainerFactory<String, QuestionBean> kafkaListenerContainerFactory() {
	    ConcurrentKafkaListenerContainerFactory<String, QuestionBean> factory =
	        new ConcurrentKafkaListenerContainerFactory<>();
	    factory.setConsumerFactory(consumerFactory1());

	    return factory;
	  }
//	  @Bean
//	  public ConsumerFactory<String, QuestionBean> consumerFactory() {
//	    return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(),
//	        new JsonDeserializer<>(QuestionBean.class));
//	  }
//
//	  @Bean
//	  public ConcurrentKafkaListenerContainerFactory<String, QuestionBean> kafkaListenerContainerFactory1() {
//	    ConcurrentKafkaListenerContainerFactory<String, QuestionBean> factory =
//	        new ConcurrentKafkaListenerContainerFactory<>();
//	    factory.setConsumerFactory(consumerFactory());
//
//	    return factory;
//	  }

	  @Bean
	  public KafkaConsumer receiver() {
	    return new KafkaConsumer();
	  }
	}
