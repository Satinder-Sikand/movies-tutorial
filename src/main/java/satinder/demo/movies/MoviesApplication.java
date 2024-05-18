package satinder.demo.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {
	
	//REST API has multiple layers
	//1 layer is controller - only concerned with getting requests and returning responses
	//Service class is where business logic goes
	//Repository layer is the data access layer does talking to database

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
	
	
	
//	@GetMapping("/")
//	public String apiIndex() {
//		return "Hello World";
//	}

}
