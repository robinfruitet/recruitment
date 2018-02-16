package com.esgi.al.model.interview_planning;

import com.esgi.al.exception.NegativeDurationException;
import com.esgi.al.model.ValueObject;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class TimeSlot extends ValueObject {

    private Date startTime;

    private Date endTime;

    public TimeSlot(Date startTime, Duration duration) {
        if (0 > duration.getSeconds()) {
            throw new NegativeDurationException();
        }

        final Instant endInstant = startTime.toInstant().plusSeconds(duration.getSeconds());

        this.startTime = startTime;
        this.endTime = Date.from(endInstant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }
}
