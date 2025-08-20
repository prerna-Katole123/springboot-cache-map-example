package com.example.demo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Cache.WeatherCache;
import com.example.demo.Entity.Weather;
import com.example.demo.Repo.WeatherRepo;
@Service
public class WeatherImpl implements WeatherService{
@Autowired
WeatherRepo wr;

WeatherCache wc=new WeatherCache();

	@Override
	public void saveWeatherDetails(Weather w) {
		wr.save(w);
	}

	@Override
	public Weather getWeatherDetails(int id) {
		
		
		if(wc.checkDataInCache(id))
		{
			return wc.getDataFromCache(id);
		}
		
		System.out.println("get data from db");
		Weather w= wr.findById(id).get();
		
		wc.storedDataInCache(w);
		
		return w;
	}
}

	


