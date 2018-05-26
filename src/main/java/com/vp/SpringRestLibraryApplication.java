package com.vp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import com.vp.domain.Books;
import com.vp.repo.BookRepository;


@SpringBootApplication
public class SpringRestLibraryApplication {

	@Autowired
	private BookRepository bookRepo;
	
	@Component
	class DataSetup implements ApplicationRunner {
		
		@Override
		public void run(ApplicationArguments args) throws Exception {
			
			bookRepo.save(new Books(9999, "title", "isbn"));
			bookRepo.save(new Books(9998, "title8", "isbn8"));
			bookRepo.save(new Books(9997, "title9", "isbn9"));
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestLibraryApplication.class, args);
	}
}
