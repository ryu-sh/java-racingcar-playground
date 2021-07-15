package racingcar;

//함수형 인터페이스 강제 = 메소드 하나이어야만 한다.
@FunctionalInterface
public interface MovingStrategy {
    boolean movable();
}
