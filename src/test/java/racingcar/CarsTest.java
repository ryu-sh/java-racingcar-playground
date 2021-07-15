package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {
    @Test
    void findWinners(){
        Car pobi = new Car("pobi",2);
        Car crong = new Car("crong",2);
        Car honux = new Car("honux",1);

        List<Car> originCars = Arrays.asList(pobi,crong,honux);
        Cars cars = new Cars(originCars);
        assertThat(cars.findWinners()).containsExactly(pobi,crong);
    }
}
