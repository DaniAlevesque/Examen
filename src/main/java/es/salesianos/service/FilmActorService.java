package es.salesianos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.salesianos.model.FilmActor;
import es.salesianos.repository.FilmActorRepository;

@Service
public class FilmActorService {

	@Autowired
	FilmActorRepository repository;

	public FilmActor searchFilmActor(String role) {
		return repository.searchFilmActor(role);
	}

	public void insertFilmActor(FilmActor filmActor) {
		repository.insertFilmActor(filmActor);
		;
	}

}