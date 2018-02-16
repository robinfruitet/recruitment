package com.esgi.al.model.interview_planning;

import com.esgi.al.model.ValueObject;

import java.util.Objects;

public class Information extends ValueObject {

    private String firstName;
    private String lastName;
    private String email;


    
    @Override
    public int hashCode() {
        return Objects.hash();
    }
}
