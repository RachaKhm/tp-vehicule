package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Reservation;
import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long reservationId);
    public Reservation addReservation(Reservation c);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservation);
}