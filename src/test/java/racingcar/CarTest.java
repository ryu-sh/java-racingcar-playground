package racingcar;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void 이동(){
        Car car = new Car("pobi"){
            @Override
            protected int getRandomNo() {
                return 4;
            }
        };
        car.move();

    }
}
