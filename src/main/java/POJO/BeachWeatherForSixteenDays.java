package POJO;

import java.util.List;

public class BeachWeatherForSixteenDays {
	
	private List<BeachForecastResponse> data;

	private String city_name;
	private String lon;
	private String timezone;
	private String lat;
	private String country_code;
	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	private String state_code;
	
	
	
	
	public List<BeachForecastResponse> getData() {
		return data;
	}

	public void setData(List<BeachForecastResponse> data) {
		this.data = data;
	}

	
}
