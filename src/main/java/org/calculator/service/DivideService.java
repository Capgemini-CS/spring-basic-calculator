package org.calculator.service;

import org.calculator.domain.Operation;
import org.calculator.domain.validation.InputValidation;
import org.calculator.exceptions.DivisionByZeroException;
import org.tinylog.Logger;

public class DivideService implements Operation {

    @Override
    public float calculate(int firstNumber, int secondNumber) {
        float result = 0;
        try {
            if (InputValidation.numberIsNotZero(secondNumber)) {
                Logger.info("Divide {} to {}.", firstNumber, secondNumber);
                result = firstNumber / secondNumber;
            }
        } catch (DivisionByZeroException e) {
            Logger.error("Second operator can not be equals to 0.");
            //TODO
        }
        return result;
    }
}
