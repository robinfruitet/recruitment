package com.esgi.al.infrastructure;

import com.esgi.al.model.ValueObject;

import java.util.Objects;
import java.util.UUID;

/**
 * Created by Robin on 16/02/2018.
 */
public class CandidateId extends ValueObject {

    protected Long id;

    public CandidateId() {
        this.id = UUID.randomUUID().getMostSignificantBits();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
