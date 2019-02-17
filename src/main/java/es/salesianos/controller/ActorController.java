package es.salesianos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.salesianos.model.Actor;
import es.salesianos.repository.ActorRepository;

@Service
public class ActorController {

	@Autowired
	private ActorRepository repository;

	public List<Actor> filterAllActor(int beginDate, int endDate) {
		return repository.searchActorYear(beginDate, endDate);
	}

	public List<Actor> selectAllActor() {
		return repository.selectAllActor();
	}

	public void insertActor(Actor actor) {
		repository.insertActor(actor);
	}

	public void deleteActor(String codString) {
		Actor actor = new Actor();
		int cod = Integer.parseInt(codString);
		actor.setCod(cod);
		repository.deleteActor(actor);
	}
}