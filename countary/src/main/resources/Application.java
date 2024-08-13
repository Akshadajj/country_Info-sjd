package src.main.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.contex.annotation.PostConstruct;

	@SpringBootApplication
	public class Application {
	    @Autowired
	    private ContinentService continentService;

	    public static void main(String[] args) {
	    	SpringApplication.run(Application.class, args);
	    }

	    @PostConstruct
	    public void init() {
	        continentService.consumeApiData();
	    }
	}
