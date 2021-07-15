package racingcar;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void 이동(){
//        Car car = new Car("pobi"){
//            @Override
//            protected int getRandomNo() {
//                return 4;
//            }
//        };
        Car car = new Car("pobi");
        //테스트 값은 무조건 경계값으로 하는걸 추천한다.
        car.move(4);

//        car.move(new MovingStrategy() {
//            @Override
//            public boolean movable() {
//                return true;
//            }
//        });
        //인터페이스의 메소드가 하나이어야만 람다 사용 가능
        car.move(() -> true);
    }
}
