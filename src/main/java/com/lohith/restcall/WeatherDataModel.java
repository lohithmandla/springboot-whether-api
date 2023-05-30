package com.lohith.restcall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDataModel {
	
	private String name;
	private String region;
	private String country;
	private Double temp_c;
	private Double temp_f;
	private String weather;
	private Double wind_mph;
	private Double wind_kph;
	private Integer humidity;
	private String localtime;

}
