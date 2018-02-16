package com.esgi.al.model;

public abstract class Entity<T extends ValueObject> {

    protected final T id;

    protected Entity(T id) {
        this.id = id;
    }
}
