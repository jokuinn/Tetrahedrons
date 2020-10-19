package com.epam.tetrahedron.data;

import java.util.*;

public class DotsValidator {
    DotsParser dotsParser = new DotsParser();

    public List<Double> validateFirstCoordinate() throws DataException {
       List<String> list = new ArrayList<>();
       list.add(dotsParser.parseFirstStr());
       list.add(dotsParser.parseSecondStr());
       list.add(dotsParser.parseThirdStr());
       list.add(dotsParser.parseFourthStr());
       list.add(dotsParser.parseFifthStr());
       list.removeIf(Objects::isNull);

       String[] array = dotsParser.parseFirstStr().split(" ");
       double getFirstDot = 0;
       double getSecondDot = 0;
       double getThirdDot = 0;
       for (int i = 0; i < array.length; i++){
           getFirstDot = Double.parseDouble(array[0]);
           getSecondDot = Double.parseDouble(array[1]);
           getThirdDot = Double.parseDouble(array[2]);
       }

       List<Double> firstCoordinate = new ArrayList<Double>();
       firstCoordinate.add(getFirstDot);
       firstCoordinate.add(getSecondDot);
       firstCoordinate.add(getThirdDot);

       return firstCoordinate;
    }

    public List<Double> validateSecondCoordinate() throws DataException {

        String[] array = dotsParser.parseSecondStr().split(" ");
        double getFirstDot = 0;
        double getSecondDot = 0;
        double getThirdDot = 0;
        for (int i = 0; i < array.length; i++){
            getFirstDot = Double.parseDouble(array[0]);
            getSecondDot = Double.parseDouble(array[1]);
            getThirdDot = Double.parseDouble(array[2]);
        }

        List<Double> secondCoordinate = new ArrayList<>();
        secondCoordinate.add(getFirstDot);
        secondCoordinate.add(getSecondDot);
        secondCoordinate.add(getThirdDot);

        return secondCoordinate;
    }

    public List<Double> validateThirdCoordinate() throws DataException {

        String[] array = dotsParser.parseThirdStr().split(" ");
        double getFirstDot = 0;
        double getSecondDot = 0;
        double getThirdDot = 0;
        for (int i = 0; i < array.length; i++){
            getFirstDot = Double.parseDouble(array[0]);
            getSecondDot = Double.parseDouble(array[1]);
            getThirdDot = Double.parseDouble(array[2]);
        }

        List<Double> thirdCoordinate = new ArrayList<>();
        thirdCoordinate.add(getFirstDot);
        thirdCoordinate.add(getSecondDot);
        thirdCoordinate.add(getThirdDot);

        return thirdCoordinate;
    }

    public List<Double> validateFourthCoordinate() throws DataException {

        String[] array = dotsParser.parseFourthStr().split(" ");
        double getFirstDot = 0;
        double getSecondDot = 0;
        double getThirdDot = 0;
        for (int i = 0; i < array.length; i++){
            getFirstDot = Double.parseDouble(array[0]);
            getSecondDot = Double.parseDouble(array[1]);
            getThirdDot = Double.parseDouble(array[2]);
        }

        List<Double> fourthCoordinate = new ArrayList<>();
        fourthCoordinate.add(getFirstDot);
        fourthCoordinate.add(getSecondDot);
        fourthCoordinate.add(getThirdDot);

        return fourthCoordinate;
    }
}
