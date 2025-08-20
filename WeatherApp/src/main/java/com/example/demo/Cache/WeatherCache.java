package com.example.demo.Cache;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.Entity.Weather;

public class WeatherCache {
	
	Map<Integer, Weather> m=new HashMap<>();
	public void storedDataInCache(Weather w)
	{
		System.out.println("data stored in cache");
		m.put(w.getId(), w);
	}
	
	public Weather getDataFromCache(int id)
	{
		System.out.println("getting data from cache");
		return m.get(id);
	}
	
	public boolean checkDataInCache(int id)
	{
		System.out.println("cheching data in cache ");
		if(m.containsKey(id))
			{
			return true;
			}
		return false;
	}

}
