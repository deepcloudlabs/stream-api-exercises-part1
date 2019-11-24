package com.example.model;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class CriteriaBean {
	private boolean yearRangeSelected;
	private int fromYear;
	private int toYear;
	private boolean genreSelected;
	private int genre;
	private boolean directorSelected;
	private int director;

	public CriteriaBean() {
	}

	public boolean isYearRangeSelected() {
		return yearRangeSelected;
	}

	public void setYearRangeSelected(boolean yearRangeSelected) {
		this.yearRangeSelected = yearRangeSelected;
	}

	public int getFromYear() {
		return fromYear;
	}

	public void setFromYear(int fromYear) {
		this.fromYear = fromYear;
	}

	public int getToYear() {
		return toYear;
	}

	public void setToYear(int toYear) {
		this.toYear = toYear;
	}

	public boolean isGenreSelected() {
		return genreSelected;
	}

	public void setGenreSelected(boolean genreSelected) {
		this.genreSelected = genreSelected;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public boolean isDirectorSelected() {
		return directorSelected;
	}

	public void setDirectorSelected(boolean directorSelected) {
		this.directorSelected = directorSelected;
	}

	public int getDirector() {
		return director;
	}

	public void setDirector(int director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "CriteriaBean [yearRangeSelected=" + yearRangeSelected
				+ ", fromYear=" + fromYear + ", toYear=" + toYear
				+ ", genreSelected=" + genreSelected + ", genre=" + genre
				+ ", directorSelected=" + directorSelected + ", director="
				+ director + "]";
	}

}
