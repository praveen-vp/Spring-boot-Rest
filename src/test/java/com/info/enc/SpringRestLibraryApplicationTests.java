package com.info.enc;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vp.SpringRestLibraryApplication;
import com.vp.repo.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRestLibraryApplication.class)
public class SpringRestLibraryApplicationTests {

	@Autowired
	private BookRepository bookRepo;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void persistanceWorks() {

		assertThat(bookRepo.findAll(),not(org.hamcrest.Matchers.emptyIterable()));
		
	}

}
