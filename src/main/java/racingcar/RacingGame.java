package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final List<Car> cars;
    private int tryNo;

    public RacingGame(List<Car> cars, int tryNo) {
        this.cars = cars;
        this.tryNo = tryNo;
    }

    private static List<Car> initCars(String carNames){
        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }
}
