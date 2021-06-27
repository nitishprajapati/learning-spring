package com.kanadn.lil.learningspring.web;

import java.util.Date;
import java.util.List;

import com.kanadn.lil.learningspring.business.domain.RoomReservation;
import com.kanadn.lil.learningspring.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reservations")
public class RoomReservationWebController {
    private final ReservationService reservationService;

    @Autowired
    public RoomReservationWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getReservations(@RequestParam(value="date", required = false)String dateString, Model model){
        Date date = DateUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservations = this.reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservations);
        return "reservations";
    }
}
//public class RoomReservationWebController {
//    @RestController
//    @RequestMapping("/rooms")
//    public class RoomController{
//        @Autowired
//        private RoomRepository roomRepository;
//        @GetMapping
//        public Iterable<Room> getRooms(){
//            return this.roomRepository.findAll();
//        }
//    }
//
//    @RestController
//    @RequestMapping("/guests")
//    public class GuestController{
//        @Autowired
//        private GuestRepository guestRepository;
//
//        @GetMapping
//        public Iterable<Guest> getGuests(){return this.guestRepository.findAll();}
//    }
//
//    @RestController
//    @RequestMapping("/reservations")
//    public class ReservationController{
//        @Autowired
//        private ReservationRepository reservationRepository;
//
//        @GetMapping
//        public Iterable<Reservation> getReservations(){return this.reservationRepository.findAll();}
//    }
//}
