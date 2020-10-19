package com.epam.tetrahedron.logic;

import com.epam.tetrahedron.data.DataException;
import com.epam.tetrahedron.data.DotsValidator;
import com.epam.tetrahedron.data.Tetrahedron;

import java.util.ArrayList;
import java.util.List;

public class Calculator{
    DotsValidator validator = new DotsValidator();

    double x1 = validator.validateFirstCoordinate().get(0);
    double y1 = validator.validateFirstCoordinate().get(1);
    double z1 = validator.validateFirstCoordinate().get(2);

    double x2 = validator.validateSecondCoordinate().get(0);
    double y2 = validator.validateSecondCoordinate().get(1);
    double z2 = validator.validateSecondCoordinate().get(2);

    double x3 = validator.validateThirdCoordinate().get(0);
    double y3 = validator.validateThirdCoordinate().get(1);
    double z3 = validator.validateThirdCoordinate().get(2);

    double x4 = validator.validateFourthCoordinate().get(0);
    double y4 = validator.validateFourthCoordinate().get(1);
    double z4 = validator.validateFourthCoordinate().get(2);

    Tetrahedron tetrahedron = new Tetrahedron(x1, x2, x3, x4, y1, y2, y3, y4, z1, z2, z3, z4);

    public Calculator() throws DataException {
    }

    public List<Double> firstVector(){
        double tempX = tetrahedron.getX2() - tetrahedron.getX1();
        double tempY = tetrahedron.getY2() - tetrahedron.getY1();
        double tempZ = tetrahedron.getZ2() - tetrahedron.getZ1();

        List<Double> firstVector = new ArrayList<>();

        firstVector.add(tempX);
        firstVector.add(tempY);
        firstVector.add(tempZ);

        return firstVector;
    }

    public List<Double> secondVector(){
        double tempX = tetrahedron.getX3() - tetrahedron.getX1();
        double tempY = tetrahedron.getY3() - tetrahedron.getY1();
        double tempZ = tetrahedron.getZ3() - tetrahedron.getZ1();

        List<Double> secondVector = new ArrayList<>();

        secondVector.add(tempX);
        secondVector.add(tempY);
        secondVector.add(tempZ);

        return secondVector;
    }

    public List<Double> thirdVector(){
        double tempX = tetrahedron.getX4() - tetrahedron.getX1();
        double tempY = tetrahedron.getY4() - tetrahedron.getY1();
        double tempZ = tetrahedron.getZ4() - tetrahedron.getZ1();

        List<Double> thirdVector = new ArrayList<>();

        thirdVector.add(tempX);
        thirdVector.add(tempY);
        thirdVector.add(tempZ);

        return thirdVector;
    }

    public double findLengthFirstVector(){
        List<Double> firstVector = firstVector();
        double tempX = firstVector.get(0);
        double tempY = firstVector.get(1);
        double tempZ = firstVector.get(2);

        return Math.sqrt(tempX * tempX + tempY * tempY + tempZ * tempZ);
    }

    public double findLengthSecondVector(){
        List<Double> secondVector = secondVector();
        double tempX = secondVector.get(0);
        double tempY = secondVector.get(1);
        double tempZ = secondVector.get(2);

        return Math.sqrt(tempX * tempX + tempY * tempY + tempZ * tempZ);
    }

    public double findLengthThirdVector(){
        List<Double> thirdVector = thirdVector();
        double tempX = thirdVector.get(0);
        double tempY = thirdVector.get(1);
        double tempZ = thirdVector.get(2);

        return Math.sqrt(tempX * tempX + tempY * tempY + tempZ * tempZ);
    }

    public double findVolumeTetrahedron(){
        return Math.pow(findLengthThirdVector(), 3) / 6 * Math.sqrt(2);
    }

    public double findAreaSurface(){
        return Math.sqrt(3) * Math.pow(findLengthThirdVector(), 2);
    }
}
