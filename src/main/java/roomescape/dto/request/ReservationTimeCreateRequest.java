package roomescape.dto.request;

import java.time.LocalTime;

public record ReservationTimeCreateRequest(LocalTime startAt) {
}
