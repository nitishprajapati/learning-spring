package com.kanadn.lil.learningspring;

import com.kanadn.lil.learningspring.data.entity.Guest;
import com.kanadn.lil.learningspring.data.entity.Reservation;
import com.kanadn.lil.learningspring.data.entity.Room;
import com.kanadn.lil.learningspring.data.repository.GuestRepository;
import com.kanadn.lil.learningspring.data.repository.ReservationRepository;
import com.kanadn.lil.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Spring annotations: https://www.educba.com/spring-boot-annotations/?source=leftnav

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}



}
