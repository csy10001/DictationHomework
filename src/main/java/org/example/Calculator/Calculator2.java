package org.example.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator2 {
    private final List<Double> resultList = new ArrayList<>();

    public double calculate(int firstNumber, int secondNumber, char operator) {
        double result = 0;
        switch (operator) {
            case '+' :
                result = firstNumber + secondNumber;
                break;
            case '-' :
                result = firstNumber - secondNumber;
                break;
            case '*' :
                result = firstNumber * secondNumber;
                break;
            case '/' :
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("나눗셈 연산에서 분모(두번째 정수)가 0일수 없습니다.");
                }
                result = firstNumber / secondNumber;
                break;
            default:
                throw new IllegalArgumentException("잘못입력하셨습니다. 다시 입력해주세요.");
        }
        addResult(result);
        return result;
    }

    public List<Double> getResultList() {
        return resultList;
    }

    public void addResult(double result) {
        resultList.add(result);
    }

    public void removeResult() {
        resultList.remove(0);
    }
}
