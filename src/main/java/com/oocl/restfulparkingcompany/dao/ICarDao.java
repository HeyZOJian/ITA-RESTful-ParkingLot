package com.oocl.restfulparkingcompany.dao;

import com.oocl.restfulparkingcompany.domain.Car;

public interface ICarDao {
    Car addCar(Car car);
    Car getCarByUUID(String uuid);
}
