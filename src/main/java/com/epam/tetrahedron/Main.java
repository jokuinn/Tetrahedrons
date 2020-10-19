package com.epam.tetrahedron;

import com.epam.tetrahedron.data.DataException;
import com.epam.tetrahedron.data.DotsValidator;
import com.epam.tetrahedron.logic.Calculator;

import java.util.List;


public class Main {
    public static void main(String[] args) throws DataException {
        DotsValidator validator = new DotsValidator();
        System.out.println(validator.validateThirdCoordinate());

        Calculator calculator = new Calculator();
        System.out.println(calculator.thirdVector());
        System.out.println(calculator.findAreaSurface());
        System.out.println(calculator.findVolumeTetrahedron());

    }
}
