package Simplilearn.com.bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookzyApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "WELCOME TO SIMPLILEARN BOOKZY ON BOOK SHOOP ";
	}

}
