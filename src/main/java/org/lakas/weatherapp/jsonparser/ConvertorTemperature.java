package org.lakas.weatherapp.jsonparser;

import org.springframework.stereotype.Component;

@Component
public class ConvertorTemperature {

    public static double celvinToCelsies(double celvinTemp) {
        return Math.round((celvinTemp - 273.15) * 10) / 10.0;
    }
}
