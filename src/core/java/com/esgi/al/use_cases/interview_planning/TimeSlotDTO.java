package com.esgi.al.use_cases.interview_planning;

import java.time.Duration;
import java.util.Date;

public class TimeSlotDTO {
    private Date startTime;

    private Duration duration;

    public Date getStartTime() {
        return startTime;
    }

    public Duration getDuration() {
        return duration;
    }
}
