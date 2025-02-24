package springPJ.mvc.monoSpring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//Routing: definizione delle rotte(route)
//rotta = path url

@Configuration
public class MvcConfigurer implements WebMvcConfigurer{
	
	public void addViewControllers(ViewControllerRegistry registry) {
		//registra un path url per la view di cui indichiamo il nome
		//addViewController definisce il path, setViewName si prende il nome
		//della pagina da raggiungere quando viene scritto nel browser il path indicato
		registry.addViewController("/").setViewName("index.html");
		registry.addViewController("/index").setViewName("index.html");
		registry.addViewController("/form").setViewName("form.html");

	}
}
