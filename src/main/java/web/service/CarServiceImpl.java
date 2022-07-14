package web.service;

import web.DAO.CarDao;
import web.DAO.CarDaoImpl;
import web.model.Car;
import java.util.List;

public class CarServiceImpl implements CarService{

    CarDao carDao = new CarDaoImpl();

    public List<Car> getListCars() {
        return carDao.getListCars();
    }

}
