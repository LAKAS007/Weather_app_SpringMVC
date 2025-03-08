package org.lakas.weatherapp.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.lakas.weatherapp.DAL.DataAccessLayer;
import org.lakas.weatherapp.model.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/weather")
public class MainController {

    @Autowired
    DataAccessLayer dataAccessLayer;

    @GetMapping()
    public String weather() {
        return "index";
    }

    @GetMapping("/result")
    public String result(@RequestParam("cityName") String cityName, Model model) throws JsonProcessingException {
        System.out.println(cityName);
        WeatherData response = dataAccessLayer.makeRequest(cityName);
        model.addAttribute("weatherData", response);
        return "show";
    }

}
