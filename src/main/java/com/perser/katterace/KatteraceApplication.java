package com.perser.katterace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
@RestController
@Controller
public class KatteraceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KatteraceApplication.class, args);
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/kontaktos")
	public String kontaktos() {
		return "kontaktos";
	}

}
