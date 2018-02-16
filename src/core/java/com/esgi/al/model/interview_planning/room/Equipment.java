package com.esgi.al.model.interview_planning.room;

import com.esgi.al.model.ValueObject;

import java.util.Objects;

class Equipment extends ValueObject {

    private String name;

    private String description;

    public Equipment(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
