package com.esgi.al.infrastructure;

import com.esgi.al.model.ValueObject;

import java.util.Objects;
import java.util.UUID;

public class InterviewId  extends ValueObject {

    protected Long id;

    public InterviewId() {
        this.id = UUID.randomUUID().getMostSignificantBits();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
