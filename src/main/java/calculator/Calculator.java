package calculator;

import java.util.List;

public class Calculator {
    public int calculator(String inputStr){
        if(isEmptyOrNull(inputStr))
            return 0;
        String[] inputArray = inputArray(inputStr);
        int sum = getSum(inputArray);;
        return sum;
    }

    private int getSum(String[] inputArray) {
        int sum = 0;
        for (String str : inputArray) {
            checkNegative(str);
            sum += Integer.parseInt(str);
        }
        return sum;
    }

    private void checkNegative(String str) {
        if(Integer.parseInt(str)<0)
            throw new RuntimeException();
    }

    public String[] inputArray(String inputStr){
        return inputStr.split(",|;");
    }

    public boolean isEmptyOrNull(String str) {
        if(str == null)
            return true;
        if(str.isEmpty())
            return true;
        return false;
    }
}
