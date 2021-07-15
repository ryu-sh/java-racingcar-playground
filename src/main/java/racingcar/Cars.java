package racingcar;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }


    public List<Car> findWinners() {
        return findWinners(getMaxPosition());
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position();
        for (Car car : cars) {
            maxPosition = car.getMaxPosition(maxPosition);
        }
        return maxPosition;
    }

    //인스턴스 변수에 의존하지 않게 하여 static으로 구현도 생각
    public static List<Car> findWinners(List<Car> cars,Position maxPosition){
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            //get을 쓰지 않고 객체에게 직접 물어본다.
            if(car.isWinner(maxPosition)){
                winners.add(car);
            }
        }
        return winners;
    }

    private List<Car> findWinners(Position maxPosition){
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            //get을 쓰지 않고 객체에게 직접 물어본다.
            if(car.isWinner(maxPosition)){
                winners.add(car);
            }
        }
        return winners;
    }
}
