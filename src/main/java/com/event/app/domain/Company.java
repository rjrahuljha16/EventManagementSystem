package com.event.app.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	private Integer total_seats;
	private Integer reserved_seats;
	private Integer available_seats;
	private Float seat_cost;
	private long userid;
	
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	@OneToOne(cascade=CascadeType.ALL,  fetch=FetchType.LAZY)
	User users;
	
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	
	public Company() {}
	
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
	public Integer getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(Integer total_seats) {
		this.total_seats = total_seats;
	}
	public Integer getReserved_seats() {
		return reserved_seats;
	}
	public void setReserved_seats(Integer reserved_seats) {
		this.reserved_seats = reserved_seats;
	}
	public Integer getAvailable_seats() {
		return available_seats;
	}
	public void setAvailable_seats(Integer available_seats) {
		this.available_seats = available_seats;
	}
	public Float getSeat_cost() {
		return seat_cost;
	}
	public void setSeat_cost(Float seat_cost) {
		this.seat_cost = seat_cost;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Company [c_id=" + c_id + ", company=" + company + ", total_seats=" + total_seats + ", reserved_seats="
				+ reserved_seats + ", available_seats=" + available_seats + ", seat_cost=" + seat_cost + "]";
	}

	
	
}
