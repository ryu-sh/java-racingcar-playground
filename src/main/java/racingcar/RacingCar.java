package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCar {
    private static final int ENDNUMBER = 5;

    public Car createCar(String inputStr) {
        return new Car(inputStr, 1);
    }

    public String[] seperator(String inputStr) {
        return inputStr.split(",");
    }

    public List<Car> play(String inputStr, int playNumber) {
        String[] cars = seperator(inputStr);
        List<Car> carList = getCars(cars);
        List<Car> winCars = new ArrayList<>();
        for(int i=0; i<playNumber; i++){
            //랜덤으로 차 움직이게 하기 & 출력
            winCars = isEndGame(carList);
            if(!winCars.isEmpty())
                break;
        }
        return winCars;
    }

    private List<Car> getCars(String[] cars) {
        List<Car> carList = new ArrayList<>();
        for (String car : cars) {
            carList.add(createCar(car));
        }
        return carList;
    }

    private List<Car> isEndGame(List<Car> carList) {
        return carList.stream().filter(car -> car.getPosition()==ENDNUMBER).collect(Collectors.toList());
    }

    public void move(Car car) {
        car.move();
    }
}
