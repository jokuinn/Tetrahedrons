package com.epam.tetrahedron.data;

import java.util.List;

public interface Repository<T> {
    void add(T tetragedron) throws DataException;
    void remove(T tetragedron) throws DataException;
    void update(T tetragedron) throws DataException;

    List<T> query(Specification<T> specification);
}
