package com.springwithhudeifa.store;

import com.springwithhudeifa.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);
        var user = new User(1L,"hudeifa","som","1234");
	}

}
