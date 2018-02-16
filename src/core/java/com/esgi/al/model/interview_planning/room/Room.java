package com.esgi.al.model.interview_planning.room;

import com.esgi.al.infrastructure.RoomId;
import com.esgi.al.model.Entity;
import com.esgi.al.model.interview_planning.interview.TimeSlot;

import java.util.Objects;

public class Room extends Entity<RoomId> {

    private String name;

    private int nbSeats;

    private Equipment equipment;

    public Room(String name, int nbSeats, Equipment equipment) {
        super(new RoomId());
        this.name = name;
        this.nbSeats = nbSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nbSeats);
    }

    public boolean isAvailable(TimeSlot timeSlot) {
        return false;
    }
}
