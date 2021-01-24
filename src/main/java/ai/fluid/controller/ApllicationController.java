package ai.fluid.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class ApllicationController {
	
	  @Value("${spring.profiles.active:unknown}")
	  private String activeProfile;
	
	@GetMapping
	public String hello()
	{
		System.out.println("Hellow");
		return "App is running and active profile is "+activeProfile;
	}

}
