package com.lohith.restcall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
	
	private String name;
	private String region;
	private String country;
	private Double lat;
	private Double lon;
	private String tz_id;
	private Long localtime_epoch;
	private String localtime;

}
