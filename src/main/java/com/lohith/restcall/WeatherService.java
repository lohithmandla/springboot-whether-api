package com.lohith.restcall;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherService {
	
	@Value("${weather.api.key}")
    private String apiKey;
    
    public WeatherDataModel getWeatherData(String location) {
		String apiUrl = "https://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + location;
		RestTemplate restTemplate = new RestTemplate();
		WeatherData weatherData = restTemplate.getForObject(apiUrl, WeatherData.class);
		WeatherDataModel weatherDataModel=new WeatherDataModel();
		weatherDataModel.setName(weatherData.getLocation().getName());
		weatherDataModel.setRegion(weatherData.getLocation().getRegion());
		weatherDataModel.setCountry(weatherData.getLocation().getCountry());
		weatherDataModel.setTemp_c(weatherData.getCurrent().getTemp_c());
		weatherDataModel.setTemp_f(weatherData.getCurrent().getTemp_f());
		weatherDataModel.setWeather(weatherData.getCurrent().getCondition().getText());
		weatherDataModel.setWind_mph(weatherData.getCurrent().getWind_mph());
		weatherDataModel.setWind_kph(weatherData.getCurrent().getWind_kph());
		weatherDataModel.setHumidity(weatherData.getCurrent().getHumidity());
		weatherDataModel.setLocaltime(weatherData.getLocation().getLocaltime());
		return weatherDataModel;
    }

}
