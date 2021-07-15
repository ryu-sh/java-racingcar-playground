package racingcar;

import java.util.Objects;

//immutable 객체
public class Position {
    private int position;

    public Position(){
        this(0);
    }

    public Position(int position) {
        if(position<0)
            throw new IllegalArgumentException("position은 음수 값을 가질 수 없다.");
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    //자주 호출하게 되면 성능 이슈가 생김 (String과 같은)
    public Position move2() {
        return new Position(position+1);
    }

    //가변 객체로 수정
    public Position move(){
        position++;
        return this;
    }

    public boolean isSame(int maxPosition) {
        return this.position == maxPosition;
    }

    public int getPosition() {
        return position;
    }

    public boolean lessThan(Position maxPosition) {
        return false;
    }
}
