package com.epam.tetrahedron.data;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotsParser {
    DataAcquirer acquirer = new FileDataAcquirer("src/test/resources/input.txt");
    Pattern pattern = Pattern.compile("[a-zA-Z]");
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    int y1 = 0;
    int y2 = 0;
    int y3 = 0;
    int z1 = 0;
    int z2 = 0;
    int z3 = 0;


    public String parseFirstStr() throws DataException {

        List<String> firstParser = acquirer.getData();
        List<String> str = Collections.singletonList(firstParser.get(0));
        String firstLine = null;
        for (String s: str){
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                firstParser.remove(0);
                firstLine = null;
            }
            else {
                firstLine = s;
            }
        }
        return firstLine;
    }

    public String parseSecondStr() throws DataException {
        List<String> parser = acquirer.getData();
        List<String> str = Collections.singletonList(parser.get(1));
        String line = null;
        for (String s: str){
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                parser.remove(1);

            }
            else {
                line = s;
            }
        }
        return line;
    }

    public String parseThirdStr() throws DataException {
        List<String> parser = acquirer.getData();
        List<String> str = Collections.singletonList(parser.get(2));
        String thirdLine = null;
        for (String s: str){
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                parser.remove(2);

            }
            else {
                thirdLine = s;
            }
        }
        return thirdLine;
    }

    public String parseFourthStr() throws DataException {
        List<String> parser = acquirer.getData();
        List<String> str = Collections.singletonList(parser.get(3));
        String fourthLine = null;
        for (String s: str){
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                parser.remove(3);
            }
            else {
                fourthLine = s;
            }
        }
        return fourthLine;
    }

    public String parseFifthStr() throws DataException {
        List<String> parser = acquirer.getData();
        List<String> str = Collections.singletonList(parser.get(4));
        String fifthLine = null;
        for (String s: str){
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                parser.remove(4);
            }
            else {
                fifthLine = s;
            }
        }
        return fifthLine;
    }

}
