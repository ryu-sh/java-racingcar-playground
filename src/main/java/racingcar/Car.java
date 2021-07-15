package racingcar;

import java.util.Random;

public class Car {
    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 1;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(){
        if(getRandomNo()>=FORWARD_NUM)
            this.position++;
    }

    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
        
    }
}
