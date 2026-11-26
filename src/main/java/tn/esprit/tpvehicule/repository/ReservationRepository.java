package tn.esprit.tpvehicule.repository;

import tn.esprit.tpvehicule.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByDateDebutAfter(LocalDate date);
    List<Reservation> findByDateFinBefore(LocalDate date);
}