package com.esgi.al.model;

public abstract class ValueObject implements Comparable<ValueObject> {

    @Override
    public int compareTo(ValueObject o) {
        return hashCode() - o.hashCode();
    }

    public abstract int hashCode();
}
