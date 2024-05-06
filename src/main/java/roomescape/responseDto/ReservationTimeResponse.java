package roomescape.responseDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import roomescape.domain.ReservationTime;

public record ReservationTimeResponse(
        Long id,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
        LocalTime startAt) {
    public static ReservationTimeResponse from(ReservationTime reservationTime) {
        return new ReservationTimeResponse(
                reservationTime.getId(),
                reservationTime.getStartAt()
        );
    }
}
