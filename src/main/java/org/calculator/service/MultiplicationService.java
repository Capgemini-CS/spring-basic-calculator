package org.calculator.service;

import org.calculator.domain.Operation;
import org.tinylog.Logger;

public class MultiplicationService implements Operation {

    @Override
    public float calculate(int firstNumber, int secondNumber) {
        Logger.info("Multiply {} by {}.", firstNumber, secondNumber);
        return firstNumber * secondNumber;
    }
}
