package com.crud.sql.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="supplies")
public class Supply {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "provider_id")
    Provider provider;
 
    @ManyToOne
    @JoinColumn(name = "piece_id")
    Piece piece;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date registeredAt;
	
	@Column(name = "price")
	private double price;

	/**
	 * void constructor
	 */
	public Supply() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param provider
	 * @param piece
	 * @param registeredAt
	 * @param price
	 */
	public Supply(int id, Provider provider, Piece piece, Date registeredAt, double price) {
		super();
		this.id = id;
		this.provider = provider;
		this.piece = piece;
		this.registeredAt = registeredAt;
		this.price = price;
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
	 * @return the provider
	 */
	public Provider getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	/**
	 * @return the piece
	 */
	public Piece getPiece() {
		return piece;
	}

	/**
	 * @param piece the piece to set
	 */
	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	/**
	 * @return the registeredAt
	 */
	public Date getRegisteredAt() {
		return registeredAt;
	}

	/**
	 * @param registeredAt the registeredAt to set
	 */
	public void setRegisteredAt(Date registeredAt) {
		this.registeredAt = registeredAt;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Supply [id=" + id + ", provider=" + provider + ", piece=" + piece + ", registeredAt=" + registeredAt
				+ ", price=" + price + "]";
	}
	
	

}
