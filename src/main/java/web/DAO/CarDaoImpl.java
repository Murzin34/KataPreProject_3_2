package web.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    List<Car> cars = new ArrayList<>();
    {
            cars.add(new Car("Lada", "Kalina", "yellow"));
            cars.add(new Car("UAZ", "Buhanka", "green"));
            cars.add(new Car("GAZ", "Volga", "black"));
            cars.add(new Car("ZIL", "130", "blue"));
            cars.add(new Car("Renault", "Logan", "white"));
        }

    @Override
    public List<Car> getCars(int i) {
        if (i >= 0 & i <= 5) {
            return cars.stream().limit(i).toList();
        } else {
            return cars;
        }
    }
}
