package racingcar;

public class Name {
    private final String name;

    public Name(String name) {
        if(name.length()>5){
            throw new IllegalArgumentException("자동차 이름은 5를 초과 할 수 없습니다.");
        }
        this.name = name;
    }
}
