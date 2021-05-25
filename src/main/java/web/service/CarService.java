package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private int size = 5;
    List<Car> carAll = new ArrayList<>();

    public CarService (Integer carNumber) {
        if (carNumber != null && carNumber >= 0 && carNumber < 5) {
            this.size = carNumber;
        }
    }

    public int getSize() {
        return size;
    }

    public List<Car> returnCar(int size) {
        carAll.add(new Car(4, "Toyota", "white"));
        carAll.add(new Car(4, "Niva", "black"));
        carAll.add(new Car(4, "Lada", "red"));
        carAll.add(new Car(4, "Honda", "gray"));
        carAll.add(new Car(4, "Opel", "yellow"));

        return carAll;
    }




}
