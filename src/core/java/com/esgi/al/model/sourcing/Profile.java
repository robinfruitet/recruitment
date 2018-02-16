package com.esgi.al.model.sourcing;

import com.esgi.al.exception.IllegalYearException;
import com.esgi.al.model.ValueObject;

import java.util.Objects;

class Profile extends ValueObject {

    private String specialism;

    private int yearExperiences;

    public Profile(String specialism, int yearExperiences) throws IllegalYearException {
        if (0 > yearExperiences)
            throw new IllegalYearException();

        this.specialism = specialism;
        this.yearExperiences = yearExperiences;
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialism);
    }
}
