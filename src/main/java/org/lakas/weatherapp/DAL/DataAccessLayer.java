package org.lakas.weatherapp.DAL;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.lakas.weatherapp.jsonparser.JsonParser;
import org.lakas.weatherapp.model.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DataAccessLayer {

    @Value("${DAL.apiKey}")
    private String apiKey;

    @Value("${DAL.requestPattern}")
    private String apiUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private JsonParser jsonParser;



    public WeatherData makeRequest(String city) throws JsonProcessingException {
        //Make request and get response
        String url = "https://" + apiUrl + "?q=" + city + "&appid=" + apiKey;
        System.out.println(url);
        ResponseEntity<String> responseJson = restTemplate.getForEntity(url, String.class);
        System.out.println("Status: " + responseJson.getStatusCode());
        System.out.printf("Body: " + responseJson.getBody());

        //Parse response
        return jsonParser.parseJson(responseJson.getBody());
    }
}
