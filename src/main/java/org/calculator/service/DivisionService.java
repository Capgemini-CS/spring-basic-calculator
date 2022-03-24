package org.calculator.service;

import org.calculator.domain.Operation;
import org.calculator.service.validation.InputValidation;
import org.calculator.exceptions.DivisionByZeroException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

@Service
public class DivisionService implements Operation {


    public DivisionService(){

    }

    @Override
    public float calculate(int firstNumber, int secondNumber) {
        InputValidation inputValidation = new InputValidation();
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

    @Override
    public String getOperationSymbol() {
        return "/";
    }


}
