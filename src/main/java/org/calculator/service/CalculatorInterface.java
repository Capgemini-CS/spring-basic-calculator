package org.calculator.service;

import org.calculator.exceptions.IncorrectInputException;

public interface CalculatorInterface {

    void executeOperation() throws IncorrectInputException;
}
