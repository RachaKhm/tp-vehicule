package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Reservation;
import tn.esprit.tpvehicule.service.interfaces.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    IReservationService reservationService;

    // http://localhost:8089/tpvehicule/reservation/retrieve-all-reservations
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservations();
    }

    // http://localhost:8089/tpvehicule/reservation/retrieve-reservation/8
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long reservationId) {
        return reservationService.retrieveReservation(reservationId);
    }

    // http://localhost:8089/tpvehicule/reservation/add-reservation
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation c) {
        return reservationService.addReservation(c);
    }

    // http://localhost:8089/tpvehicule/reservation/remove-reservation/{reservation-id}
    @DeleteMapping("/remove-reservation")
    public void removeReservation(@RequestParam Long reservationId) {
        reservationService.removeReservation(reservationId);
    }

    // http://localhost:8089/tpvehicule/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation c) {
        return reservationService.modifyReservation(c);
    }
}