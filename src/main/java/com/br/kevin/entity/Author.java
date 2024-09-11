package com.br.kevin.entity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Author {
	private Id id;
	private String externalId;
}
