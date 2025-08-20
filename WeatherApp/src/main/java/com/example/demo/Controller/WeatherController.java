package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Weather;
import com.example.demo.Service.WeatherService;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService ws;
	
	@PostMapping("weather")
	public String addWeatherInfo(@RequestBody Weather w)
	{
		ws.saveWeatherDetails(w);
		return "weather info added";
	}
	
	@GetMapping("weather/{id}")
	public Weather getWeatherInfo(@PathVariable int id)
	{
		return ws.getWeatherDetails(id);
	}

}
