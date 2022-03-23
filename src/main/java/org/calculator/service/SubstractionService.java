package org.calculator.service;

import org.calculator.domain.Operation;
import org.tinylog.Logger;

public class SubstractionService implements Operation {

    @Override
    public float calculate(int firstNumber, int secondNumber) {
        Logger.info("Substract {} from {}.", firstNumber, secondNumber);
        return firstNumber - secondNumber;
    }
}
