package springPJ.mvc.monoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonoSpringApplication.class, args);
		System.out.println("monolite sulla porta 8097");
	}
}
