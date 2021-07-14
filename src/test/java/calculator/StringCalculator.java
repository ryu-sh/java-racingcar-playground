package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculator {
    private Calculator calculator = new Calculator();
    @Test
    void isEmptyOrNull(){
        String emptyStr = "";
        String nullStr = null;
        int emptyNumber = calculator.calculator(emptyStr);
        int nullNumber = calculator.calculator(nullStr);

        Assertions.assertThat(emptyNumber).isEqualTo(0);
        Assertions.assertThat(nullNumber).isEqualTo(0);
    }

    @Test
    void checkSeparator(){
        String input = "2,3";
        int calculatorNumber = this.calculator.calculator(input);
        Assertions.assertThat(calculatorNumber).isEqualTo(5);
    }

    @Test
    void checkNegative(){
        String input  = "-1,2,3";
        Assertions.assertThatThrownBy(() -> calculator.calculator(input))
                .isInstanceOf(RuntimeException.class);
    }
}
