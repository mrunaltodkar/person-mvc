package com.capgemini.spring.mvc.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.mvc.model.entity.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private JdbcTemplate template;

	public void addNew(Person person) {
		template.update("INSERT INTO PERSON VALUES(?,?)",
				new Object[] { person.getPersonId(), person.getPersonName() });

	}

	public List<Person> getAll() {

		return null;
	}

	public void update(Person person) {

	}

	public void delete(int personId) {

	}

	public Person getPerson(int personId) {

		return null;
	}

}
