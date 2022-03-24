package org.calculator.service;

import org.calculator.domain.Operation;
import org.calculator.service.validation.InputValidation;
import org.calculator.exceptions.DivisionByZeroException;
import org.springframework.beans.factory.annotation.Autowired;
import org.tinylog.Logger;

public class DivideService implements Operation {

    @Autowired
    private final InputValidation inputValidation;


    public DivideService(InputValidation inputValidation){
        this.inputValidation = inputValidation;
    }

    @Override
    public float calculate(int firstNumber, int secondNumber) {
        float result = 0;
        try {
            if (inputValidation.numberIsNotZero(secondNumber)) {
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
