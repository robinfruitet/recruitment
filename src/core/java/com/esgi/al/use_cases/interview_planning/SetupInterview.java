package com.esgi.al.use_cases.interview_planning;

import com.esgi.al.infrastructure.InterviewId;
import com.esgi.al.infrastructure.RoomId;
import com.esgi.al.infrastructure.repository.InterviewRepository;
import com.esgi.al.infrastructure.repository.RoomRepository;
import com.esgi.al.model.interview_planning.interview.Interview;
import com.esgi.al.model.interview_planning.room.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SetupInterview {

    @Autowired
    private InterviewRepository interviewRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Transactional
    public void prepareInterview(CandidateDTO candidate, TimeSlotDTO timeSlot) {
        Room room = roomRepository.findFirstFree(timeSlot);
        Interview interview = new Interview(candidate, timeSlot);

        roomRepository.book(room);
        interviewRepository.save(interview);
    }

    @Transactional
    public void cancelInterview(InterviewId interviewId, RoomId roomId) {
        interviewRepository.cancel(interviewId);
    }

    @Transactional
    public void cancelRoom(RoomId roomId) {
        roomRepository.cancel(roomId);
    }
}
