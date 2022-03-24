package org.calculator.service.validation;

import org.calculator.exceptions.DivisionByZeroException;
import org.calculator.exceptions.IncorrectInputException;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

@Service
public class InputValidation {

    public boolean valueIsOneOfTheOperators(String value) throws IncorrectInputException {
        String allowedOperators = "+-*/";
        if (!allowedOperators.contains(value)) {
            throw new IncorrectInputException("This operator is not allowed!");
        }
        return true;
    }

    public boolean numberIsNotZero(int value) throws DivisionByZeroException {
        if (value == 0) {
            throw new DivisionByZeroException("The division is not possible because second number is equals to zero.");
        }
        return true;
    }

    public int stringToNumericValue(String value) {
        int number = 0;
        try {
            number =  Integer.parseInt(value);
        } catch (NumberFormatException e) {
            Logger.error("The value is not numeric.");
        }
        return number;
    }
}
