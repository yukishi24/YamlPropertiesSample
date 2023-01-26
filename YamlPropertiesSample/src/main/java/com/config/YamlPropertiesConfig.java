package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "error")
@PropertySource(value = "classpath:properties/message.yml",
    factory = YamlPropertySourceFactory.class)
@Data
public class YamlPropertiesConfig {
  private String Err01;
  private String Err02;
}
