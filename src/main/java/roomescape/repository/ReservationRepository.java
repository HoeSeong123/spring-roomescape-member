package roomescape.repository;

import roomescape.domain.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository {

    List<Reservation> findAll();

    List<Reservation> findByDateAndThemeId(LocalDate date, Long id);

    List<Reservation> findSearchedReservation(Long themeId, Long memberId, LocalDate dateFrom, LocalDate dateTo);

    Reservation save(Reservation reservation);

    int deleteById(Long id);
}
