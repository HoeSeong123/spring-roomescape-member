package roomescape.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalTime;

public record AvailableTimeResponse(
        Long timeId,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
        LocalTime startAt,
        Boolean alreadyBooked) {
    public static AvailableTimeResponse from(Long timeId, LocalTime startAt, Boolean alreadyBooked) {
        return new AvailableTimeResponse(
                timeId,
                startAt,
                alreadyBooked
        );
    }
}
