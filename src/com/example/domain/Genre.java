package com.example.domain;

import java.util.Objects;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class Genre {
	private int id;
	private String name;

	public Genre() {
	}

	public Genre(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Genre genre = (Genre) o;
		return id == genre.id;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + "]";
	}

}
