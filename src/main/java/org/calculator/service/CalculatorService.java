package org.calculator.service;

import org.calculator.domain.Operation;
import org.calculator.exceptions.IncorrectInputException;
import org.calculator.service.input.ConsoleInputService;
import org.calculator.service.ouput.ShowInConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

import java.util.List;

@Service
public class CalculatorService implements CalculatorInterface{

    @Autowired
    private final List<Operation> operationList;

    @Autowired
    private final ConsoleInputService consoleInputService;

    @Autowired
    private final ShowInConsoleService showInConsoleService;

    public CalculatorService(List<Operation> operationList, ShowInConsoleService showInConsoleService, ConsoleInputService consoleInputService){
        this.showInConsoleService = showInConsoleService;
        this.consoleInputService = consoleInputService;
        this.operationList = operationList;
    }

    @Override
    public void executeOperation() throws IncorrectInputException {
        Logger.info("Executing operation...");
        float operationResult  = getOperationResult(consoleInputService.getInputValueFirstNumber(),
                consoleInputService.getInputValueSecondNumber(),
                consoleInputService.getInputValueOperator());
        showInConsoleService.showOutput(operationResult);
    }


    public float getOperationResult(int firstNumber, int secondNumber, String operator){
        float result = 0;
        for(Operation operation : operationList){
            if(operation.getOperationSymbol().equals(operator)){
                result = operation.calculate(firstNumber, secondNumber);
            }
        }
        return result;
    }
}
