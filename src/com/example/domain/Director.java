package com.example.domain;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class Director {
	private int id;
	private String name;
	private String imdb;

	public Director() {
	}

	public Director(int id, String name, String imdb) {
		this.id = id;
		this.name = name;
		this.imdb = imdb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Director other = (Director) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Director [id=" + id + ", name=" + name + ", imdb=" + imdb + "]";
	}

}
