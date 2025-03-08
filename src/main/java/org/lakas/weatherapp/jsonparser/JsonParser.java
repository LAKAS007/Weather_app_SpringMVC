package org.lakas.weatherapp.jsonparser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.lakas.weatherapp.model.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JsonParser {

    @Autowired
    private ObjectMapper objectMapper;

    public WeatherData parseJson(String json) throws JsonProcessingException {
        try {
            WeatherData weatherData = objectMapper.readValue(json, WeatherData.class);
            return weatherData;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
