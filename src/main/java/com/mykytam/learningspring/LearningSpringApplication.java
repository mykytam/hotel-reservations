package com.mykytam.learningspring;

import com.mykytam.learningspring.data.entity.Guest;
import com.mykytam.learningspring.data.entity.Reservation;
import com.mykytam.learningspring.data.entity.Room;
import com.mykytam.learningspring.data.repository.GuestRepository;
import com.mykytam.learningspring.data.repository.RoomRepository;
import com.mykytam.learningspring.data.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // configuration file and starter
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

	@RestController // It's a convenience annotation that combines @Controller and @ResponseBody
	@RequestMapping("/rooms") // Annotation is used to map web requests to Spring Controller methods
	public class RoomController{
		@Autowired // Dependency Injection
		private RoomRepository roomRepository;

		@GetMapping // Annotation maps HTTP GET requests onto specific handler methods
		public Iterable<Room> getRooms() {
			return this.roomRepository.findAll();
		}
	}

	@RestController // It's a convenience annotation that combines @Controller and @ResponseBody
	@RequestMapping("/guests") // Annotation is used to map web requests to Spring Controller methods
	public class GuestController{
		@Autowired // Dependency Injection
		private GuestRepository guestRepository;

		@GetMapping // Annotation maps HTTP GET requests onto specific handler methods
		public Iterable<Guest> getGuests() {
			return this.guestRepository.findAll();
		}
	}

	@RestController // It's a convenience annotation that combines @Controller and @ResponseBody
	@RequestMapping("/reservations") // Annotation is used to map web requests to Spring Controller methods
	public class ReservationController{
		@Autowired // Dependency Injection
		private ReservationRepository reservationRepository;

		@GetMapping // Annotation maps HTTP GET requests onto specific handler methods
		public Iterable<Reservation> getReservations() {
			return this.reservationRepository.findAll();
		}
	}

}
