package com.event.app.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1135437282226228459L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long c_id;
	private String company;
	private int total_seats;
	private int reserved_seats;
	private int available_seats;
	private float seat_cost;

	
	
	public Long getC_id() {
		return c_id;
	}

	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}

	public int getReserved_seats() {
		return reserved_seats;
	}

	public void setReserved_seats(int reserved_seats) {
		this.reserved_seats = reserved_seats;
	}

	public int getAvailable_seats() {
		return available_seats;
	}

	public void setAvailable_seats(int available_seats) {
		this.available_seats = available_seats;
	}

	public float getSeat_cost() {
		return seat_cost;
	}

	public void setSeat_cost(float seat_cost) {
		this.seat_cost = seat_cost;
	}

	public Company() {
	}

	public Company(Long c_id, String company, int total_seats, int reserved_seats, int available_seats,
			float seat_cost) {
		super();
		this.c_id = c_id;
		this.company = company;
		this.total_seats = total_seats;
		this.reserved_seats = reserved_seats;
		this.available_seats = available_seats;
		this.seat_cost = seat_cost;
	}

	@Override
	public String toString() {
		return "Company [c_id=" + c_id + ", company=" + company + ", total_seats=" + total_seats + ", reserved_seats="
				+ reserved_seats + ", available_seats=" + available_seats + ", seat_cost=" + seat_cost + "]";
	}

}
