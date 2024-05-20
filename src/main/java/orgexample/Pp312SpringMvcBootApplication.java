package orgexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import orgexample.model.User;
import orgexample.service.UserService;

@SpringBootApplication
public class Pp312SpringMvcBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Pp312SpringMvcBootApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		User user1 = new User("Иван","Петров","email1@mail.ru");
		User user2 = new User("Коля","Сидоров","email2@mail.ru");
		User user3 = new User("Петя","Иванов","email3@mail.ru");
		userService.deleteAllUsers();
		userService.addUser(user1);
		userService.addUser(user2);
		userService.addUser(user3);
		SpringApplication.run(Pp312SpringMvcBootApplication.class, args);
	}

}
