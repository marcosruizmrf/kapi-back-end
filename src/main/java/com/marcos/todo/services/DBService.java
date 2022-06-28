package com.marcos.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.todo.domain.Todo;
import com.marcos.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;
 
	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(1, "João", "Arruela Especial", 123, 999, "Em desenvolvimento", "André", "001", sdf.parse("25/03/2022"), false);

		Todo t2 = new Todo(2, "Maria", "Biela Simétrica", 1234, 1000, "Em desenvolvimento", "André", "002", sdf.parse("22/03/2021"), false);

		todoRepository.saveAll(Arrays.asList(t1, t2));
	}
	
}