package com.epam.tetrahedron.data;

import java.util.List;

public interface DataAcquirer {
    List<String> getData() throws DataException;
}
