package com.mykytam.learningspring;

import com.mykytam.learningspring.data.entity.Room;
import com.mykytam.learningspring.data.repository.RoomRepository;
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

}
