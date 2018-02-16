package com.esgi.al.infrastructure.repository;

import com.esgi.al.infrastructure.RoomId;
import com.esgi.al.model.interview_planning.room.Room;
import com.esgi.al.use_cases.interview_planning.TimeSlotDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class RoomRepository implements JpaRepository<Room, Long> {

    public abstract Room findFirstFree(TimeSlotDTO timeSlot);

    public abstract Room book(Room room);

    public abstract void cancel(RoomId roomId);
}
