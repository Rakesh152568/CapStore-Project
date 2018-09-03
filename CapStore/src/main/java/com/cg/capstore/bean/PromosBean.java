package com.cg.capstore.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="promos")
public class PromosBean {

	@Id
	@Column(name="promo_code")
	private String promoCode;
	@Column(name="discount")
	private Integer discount;
	@Column(name="time_period")
	private Date timePeriod;
	
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Date getTimePeriod() {
		return timePeriod;
	}
	public void setTimePeriod(Date timePeriod) {
		this.timePeriod = timePeriod;
	}

}