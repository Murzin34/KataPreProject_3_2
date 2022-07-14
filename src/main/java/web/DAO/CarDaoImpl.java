package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    public List<Car> getListCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Lada", "Kalina", "yellow"));
        cars.add(new Car("UAZ", "Buhanka", "green"));
        cars.add(new Car("GAZ", "Volga", "black"));
        cars.add(new Car("ZIL", "130", "blue"));
        cars.add(new Car("Renault", "Logan", "white"));

        return cars;
    }
}
