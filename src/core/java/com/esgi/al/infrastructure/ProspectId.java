package com.esgi.al.infrastructure;

import com.esgi.al.model.ValueObject;

import java.util.Objects;
import java.util.UUID;

public class ProspectId extends ValueObject {

    protected Long id;

    public ProspectId() {
        this.id = UUID.randomUUID().getMostSignificantBits();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
