package com.br.kevin.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	private Id id;
	private String externalId;
	private String title;
	private Date publishedDate;
	private Author author;
	private String description;
}
