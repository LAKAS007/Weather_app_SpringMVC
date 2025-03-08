package org.lakas.weatherapp.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.javac.Main;
import org.lakas.weatherapp.jsonparser.JsonParser;
import org.lakas.weatherapp.model.WeatherData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@Configuration
@PropertySource("classpath:property.properties")
public class SpringConfig {

    @Bean
    public WeatherData weatherData() {
    return new WeatherData();
}

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public JsonParser jsonParser() {
        return new JsonParser();
    }
}
