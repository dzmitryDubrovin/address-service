package com.danco.addresswrap.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Synonym")
public class Synonym {

	@Id
	@Column(name="synonym_id")
	@GeneratedValue
	private Integer id;
	
	@Column(name="key")
	private String key;
	
	@Column(name="value")
	private String value;

	public Synonym(Integer id, String key, String value) {
		super();
		this.id = id;
		this.key = key;
		this.value = value;
	}

	public Synonym() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}