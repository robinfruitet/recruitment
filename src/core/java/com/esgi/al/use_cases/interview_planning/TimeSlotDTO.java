package com.esgi.al.use_cases.interview_planning;

import java.time.Duration;
import java.util.Date;

/**
 * Created by Robin on 16/02/2018.
 */
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
