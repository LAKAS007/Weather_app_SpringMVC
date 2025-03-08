package org.lakas.weatherapp.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.tools.javac.Main;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {

    @JsonProperty("name")
    private String city;
    @JsonProperty("main")
    private MainTab main;


    public WeatherData(String city, MainTab main) {
        this.city = city;
        this.main = main;
    }

    public WeatherData() {}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public MainTab getMain() {
        return main;
    }

    public void setMain(MainTab main) {
        this.main = main;
    }
}
