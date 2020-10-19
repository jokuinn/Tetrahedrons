package com.epam.tetrahedron.data;

public interface Specification<T> {
    boolean specified(T object);
}
