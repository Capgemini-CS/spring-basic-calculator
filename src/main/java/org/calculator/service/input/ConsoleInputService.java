package org.calculator.service.input;

import org.calculator.domain.ConsoleInput;
import org.calculator.domain.InputValueInterface;
import org.calculator.service.validation.InputValidation;
import org.calculator.exceptions.IncorrectInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

import java.util.Scanner;

@Service
public class ConsoleInputService implements InputValueInterface {

    @Autowired
    private final InputValidation inputValidation;

    private final ConsoleInput consoleInput = new ConsoleInput();

    private static Scanner scanner = new Scanner(System.in);


    public ConsoleInputService(InputValidation inputValidation){
        this.inputValidation = inputValidation;
    }

    @Override
    public int getInputValueFirstNumber() throws IncorrectInputException {
       consoleInput.setFirstNumber(scanner.nextInt());
       return consoleInput.getFirstNumber();
    }

    @Override
    public int getInputValueSecondNumber() throws IncorrectInputException {
        consoleInput.setSecondNumber(scanner.nextInt());
        return consoleInput.getSecondNumber();
    }

    @Override
    public String getInputValueOperator() throws IncorrectInputException {
        consoleInput.setOperator(scanner.next());
        try{
            if(!inputValidation.valueIsOneOfTheOperators(consoleInput.getOperator())){
                return null;
            }
        }catch (IncorrectInputException e){
            Logger.error("Incorrect input operator.");
            throw new IncorrectInputException("Incorrect input operator.");
        }
        return consoleInput.getOperator();
    }
}
