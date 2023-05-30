package com.lohith.restcall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WhetherController {

	 @Autowired
	    private WeatherService weatherService;

	    @GetMapping("/weather/{location}")
	    public WeatherDataModel getWeather(@PathVariable String location) {
	        return weatherService.getWeatherData(location);
	    }
}
