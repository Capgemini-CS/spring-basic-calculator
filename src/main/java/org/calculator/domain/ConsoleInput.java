package org.calculator.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ConsoleInput {

    private int firstNumber;

    private int secondNumber;

    private String operator;

}
