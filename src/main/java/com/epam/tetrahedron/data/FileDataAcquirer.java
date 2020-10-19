package com.epam.tetrahedron.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {
    private String filename;

    public FileDataAcquirer(String filename){
        this.filename = filename;
    }

    @Override
    public List<String> getData() throws DataException {
        try{
            BufferedReader input = new BufferedReader(new FileReader(filename));
            String line;
            List<String> list = new ArrayList<>();
            while((line  = input.readLine()) != null){
                list.add(line);
            }
            return list;
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }
    }
}
