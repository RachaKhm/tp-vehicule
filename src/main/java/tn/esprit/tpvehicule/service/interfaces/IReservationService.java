package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long reservationId);
    public Reservation addReservation(Reservation c);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservation);
    List<Reservation> getReservationsAfterDate(LocalDate date);
    List<Reservation> getReservationsBeforeDate(LocalDate date);
}