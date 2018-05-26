package com.vp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Books {

	@Id
	@GeneratedValue
	long id;
	@NotNull
	private String title;
	@NotNull
	private String isbn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @param id
	 * @param title
	 * @param isbn
	 */
	public Books(long id, @NotNull String title, @NotNull String isbn) {
		this.id = id;
		this.title = title;
		this.isbn = isbn;
	}

	/**
	 * 
	 */
	public Books() {
	}

}
