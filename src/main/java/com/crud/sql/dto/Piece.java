package com.crud.sql.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="piece")
public class Piece {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Supply> supply;

	/**
	 * void constructor
	 */
	public Piece() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param supply
	 */
	public Piece(int id, String name, List<Supply> supply) {
		super();
		this.id = id;
		this.name = name;
		this.supply = supply;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the supply
	 */
	public List<Supply> getSupply() {
		return supply;
	}

	/**
	 * @param supply the supply to set
	 */
	public void setSupply(List<Supply> supply) {
		this.supply = supply;
	}

	@Override
	public String toString() {
		return "Piece [id=" + id + ", name=" + name + ", supply=" + supply + "]";
	}
	
	
	
	

}
