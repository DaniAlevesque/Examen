package es.salesianos.model;

public class FilmActor {

	private int cache;
	private String role;
	private int codFilm;
	private int codActor;
	private String title;
	private String name;
	private int year;
	
	public int getCache() {
		return cache;
	}
	public void setCache(int cache) {
		this.cache = cache;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getCodFilm() {
		return codFilm;
	}
	public void setCodFilm(int codFilm) {
		this.codFilm = codFilm;
	}
	public int getCodActor() {
		return codActor;
	}
	public void setCodActor(int codActor) {
		this.codActor = codActor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}