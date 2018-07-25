package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.DB;
import com.oocl.restfulparkingcompany.domain.Car;
import org.springframework.stereotype.Component;

@Component
public class CarDao implements ICarDao {
    @Override
    public Car addCar(Car car) {
        return DB.addCar(car);
    }

    @Override
    public Car getCarByUUID(String uuid) {
        return DB.getCarByUUID(uuid);
    }
}
