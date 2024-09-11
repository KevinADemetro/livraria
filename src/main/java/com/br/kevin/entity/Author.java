package com.br.kevin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Author {
	private Id id;
	private String externalId;
	private String name;
}
