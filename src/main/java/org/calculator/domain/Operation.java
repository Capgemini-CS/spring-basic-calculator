package org.calculator.domain;

public interface Operation {

    float calculate(int firstNumber, int secondNumber);

    String getOperationSymbol();

}
