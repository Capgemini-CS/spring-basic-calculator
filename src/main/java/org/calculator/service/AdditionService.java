package org.calculator.service;

import org.calculator.domain.Operation;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

@Service
public class AdditionService implements Operation {

    @Override
    public float calculate(int firstNumber, int secondNumber) {
        Logger.info("Add {} and {}.", firstNumber, secondNumber);
        return firstNumber + secondNumber;
    }

    @Override
    public String getOperationSymbol() {
        return "+";
    }


}
