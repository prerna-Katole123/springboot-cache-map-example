package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Weather;

public interface WeatherRepo extends JpaRepository<Weather, Integer>{

}
