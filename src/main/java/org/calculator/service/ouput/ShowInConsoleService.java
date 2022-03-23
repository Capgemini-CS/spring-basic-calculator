package org.calculator.service.ouput;

import org.springframework.stereotype.Service;

@Service
public class ShowInConsoleService implements Screen{


    @Override
    public void showOutput(float result) {
        System.out.println("The result is: " + result);
    }

}
