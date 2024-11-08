package com.keyin.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Iterable<Car> getAllCars(){
        return carRepository.findAll();
    }

    public Car createCar(Car car){
        return carRepository.save(car);
    }
}
