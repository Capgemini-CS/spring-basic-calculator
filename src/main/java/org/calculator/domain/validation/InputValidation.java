package org.calculator.domain.validation;

import org.calculator.exceptions.DivisionByZeroException;
import org.calculator.exceptions.IncorrectInputException;
import org.tinylog.Logger;

public class InputValidation {

    public static boolean valueIsOneOfTheOperators(String value) throws IncorrectInputException {
        String allowedOperators = "+-*/";
        if (!allowedOperators.contains(value)) {
            throw new IncorrectInputException("This operator is not allowed!");
        }
        return true;
    }

    public static boolean numberIsNotZero(int value) throws DivisionByZeroException {
        if (value == 0) {
            throw new DivisionByZeroException("The division is not possible because second number is equals to zero.");
        }
        return true;
    }

    public static int stringToNumericValue(String value) {
        int number = 0;
        try {
            number =  Integer.parseInt(value);
        } catch (NumberFormatException e) {
            Logger.error("The value is not numeric.");
        }
        return number;
    }
}
