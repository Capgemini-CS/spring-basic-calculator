package org.calculator.domain;

import org.calculator.exceptions.IncorrectInputException;

public interface InputValueInterface {

    int getInputValueFirstNumber() throws IncorrectInputException;
    int getInputValueSecondNumber() throws IncorrectInputException;
    String getInputValueOperator() throws IncorrectInputException;

}
