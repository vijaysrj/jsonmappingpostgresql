package com.mapping.jsontype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "MY_TABLE", schema = "public")
@org.hibernate.annotations.TypeDef(name = "JsonType", typeClass = JsonType.class)
public class MyTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "data")
	@Type(type = "JsonType")
	private Person data;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the data
	 */
	public Person getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Person data) {
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyTable [id=" + id + ", data=" + data + "]";
	}

}
