package racingcar;

import java.util.Random;

public class Car {
    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;

    private Name name;
    private int position;
    private Position position2;

    public Car(String name) {
        this(name,0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position2 = new Position(position);
    }

    public Name getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public Position getPosition2(){
        return position2;
    }

    public void move(){
        if(getRandomNo()>=FORWARD_NUM)
            this.position++;
    }

    // 의존성을 한단계 위의 클래스로 옮긴다.
    public void move(int randomNumber){
        //해당 조건의 요구사항이 자주 바뀔경우 인터페이스로 빼는것을 추천한다.
        if(randomNumber>=FORWARD_NUM){
            position2 = position2.move();
        }
    }

    public void move(MovingStrategy movingStrategy){
        if(movingStrategy.movable())
            this.position++;
    }

    // 레거시 코드를 건들지 않으면서 테스트를 성공하는 방법 protected로 변경하고 테스트 코드에서 재정의 하기
    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }

    public boolean isWinner(Position maxPosition) {
        //return position2.isSame(maxPosition);
        return position2.equals(maxPosition);
    }

    //아래 로직을 position 객체로 넘길 수 있다. isWinner 처럼
    public Position getMaxPosition(Position maxPosition) {
        if(position2.lessThan(maxPosition))
            return maxPosition;
        return this.position2;
    }
}
