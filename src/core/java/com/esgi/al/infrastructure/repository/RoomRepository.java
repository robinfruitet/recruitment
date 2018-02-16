package com.esgi.al.infrastructure.repository;

import com.esgi.al.infrastructure.RoomId;
import com.esgi.al.model.interview_planning.room.Room;
import com.esgi.al.use_cases.interview_planning.TimeSlotDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

    Room findFirstFree(TimeSlotDTO timeSlot);

    Room book(Room room);

    void cancel(RoomId roomId);
}
