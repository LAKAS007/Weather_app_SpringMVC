package org.lakas.weatherapp.model;

// "temp": 284.32,
//         "feels_like": 283.22,
//         "temp_min": 281.39,
//         "temp_max": 284.47,
//         "pressure": 1010,
//         "humidity": 66,
//         "sea_level": 1010,
//         "grnd_level": 991


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.lakas.weatherapp.jsonparser.ConvertorTemperature;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainTab {
    @JsonProperty("temp")
    double temp;
    @JsonProperty("feels_like")
    double feels_like;
    @JsonProperty("temp_min")
    double temp_min;
    @JsonProperty("temp_max")
    double temp_max;
    @JsonProperty("pressure")
    int pressure;
    @JsonProperty("humidity")
    int humidity;
    @JsonProperty("sea_level")
    int sea_level;
    @JsonProperty("grnd_level")
    int grnd_level;

    public MainTab(double temp, double feels_like, double temp_min, double temp_max, int pressure, int humidity, int sea_level, int grnd_level) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
    }

    public MainTab(){}

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = ConvertorTemperature.celvinToCelsies(temp);
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = ConvertorTemperature.celvinToCelsies(feels_like);
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = ConvertorTemperature.celvinToCelsies(temp_min);
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = ConvertorTemperature.celvinToCelsies(temp_max);
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getSea_level() {
        return sea_level;
    }

    public void setSea_level(int sea_level) {
        this.sea_level = sea_level;
    }

    public int getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(int grnd_level) {
        this.grnd_level = grnd_level;
    }
}


