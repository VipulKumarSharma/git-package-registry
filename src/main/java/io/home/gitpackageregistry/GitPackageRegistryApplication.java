package io.home.gitpackageregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GitPackageRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitPackageRegistryApplication.class, args);
	}

	@GetMapping("/")
	public String showAppName() {
		return "Git Package Registry App";
	}

	@GetMapping("/status")
	public String showAppStatus() {
		return "Git Package Registry App is in running status";
	}
}
