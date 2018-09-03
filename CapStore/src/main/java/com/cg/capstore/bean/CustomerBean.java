package com.cg.capstore.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerBean {

	@Id
	@Column(name="customer_id")
	private String email;

	@Column(name="password")
	private String password;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="mobile_num")
	private String mobileNo;

	@Column(name="address")
	private String address;
	
	@OneToOne
	@JoinColumn(name="wishlist_id")
	private WishlistBean wishlist;
	
	@OneToMany
	//@JoinColumn(name="cart")
	private List<ProductBean> cart;

	@OneToOne
	@JoinColumn(name="order_id")
	private OrderBean order;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public WishlistBean getWishlist() {
		return wishlist;
	}
	public void setWishlist(WishlistBean wishlist) {
		this.wishlist = wishlist;
	}
	public OrderBean getOrder() {
		return order;
	}
	public void setOrder(OrderBean order) {
		this.order = order;
	}
	public CustomerBean(String email, String password, String customerName, String mobileNo, String address,
			WishlistBean wishlist, OrderBean order) {
		super();
		this.email = email;
		this.password = password;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.wishlist = wishlist;
		this.order = order;
	}
	public CustomerBean() {
		super();
		
	}
	
	
	
}