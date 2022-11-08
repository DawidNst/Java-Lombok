package com.crud.tasks;

import com.crud.tasks.domain.TaskDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TasksApplicationTests {

	@Test
	void contextLoads() {
	}
	@SpringBootApplication
	public class TasksApplication {

		public static void main(String[] args) {
			TaskDto taskDto = new TaskDto(
					(long)1,
					"Test title",
					"I want to be a coder!");
			SpringApplication.run(TasksApplication.class, args);
		}

	}

}
