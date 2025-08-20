package com.example.demo.Service;



import com.example.demo.Entity.Weather;

public interface WeatherService {
	public void saveWeatherDetails(Weather w);
	
	public Weather getWeatherDetails(int id);

}
