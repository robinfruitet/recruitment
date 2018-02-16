package com.esgi.al.model.sourcing;

import com.esgi.al.infrastructure.ProspectId;
import com.esgi.al.model.Entity;

import java.util.Objects;

public class Prospect extends Entity<ProspectId> {

    private Information information;

    private Profile profile;

    public Prospect(Information information, Profile profile) {
        super(new ProspectId());
        this.information = information;
        this.profile = profile;
    }

    public boolean isParticular() {
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(information, profile);
    }

    public Profile getProfile() {
        return profile;
    }

    public boolean validateByCTO() {
        return true;
    }
}
