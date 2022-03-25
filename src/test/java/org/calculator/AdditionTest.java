package org.calculator;

import org.calculator.service.AdditionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

//    @Autowired
//    AdditionService additionService;
//
//    public AdditionTest(AdditionService additionService) {
//        this.additionService = additionService;
//    }

    AdditionService additionService = new AdditionService();

    @Test
    void executeAddition() {
        assertEquals(3, additionService.calculate(1,2));
    }

}