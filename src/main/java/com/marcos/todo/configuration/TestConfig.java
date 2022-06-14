package com.marcos.todo.configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import com.marcos.todo.domain.Todo;
import com.marcos.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcos.todo.services.DBService;

@Configuration
@Profile("local")
public class LocalConfig {

	@Autowired
	private TodoRepository repository;

	@Bean
	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Marcos Ruiz", "Arruela Especial", 123, 999, "Em desenvolvimento", "001", sdf.parse("25/03/2022"), false);

		Todo t2 = new Todo(null, "Giulianna Fernandes", "Biela Simétrica", 1234, 1000, "Em desenvolvimento", "002", sdf.parse("22/03/2021"), false);

		repository.saveAll(Arrays.asList(t1, t2));
	}
}
