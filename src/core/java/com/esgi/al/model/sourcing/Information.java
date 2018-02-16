package com.esgi.al.model.sourcing;

import com.esgi.al.model.ValueObject;

import java.util.Objects;

class Information extends ValueObject {

    private String firstName;
    private String lastName;
    private String email;

    public Information(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }
}
