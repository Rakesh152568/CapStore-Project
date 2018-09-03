package com.cg.capstore.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Wishlist")
public class WishlistBean {
	
	@Id
	@Column(name="wishlist_id")
	private String wishlistId;
	
	@ManyToMany
	@JoinColumn(name="product_id")
	private List<ProductBean> product;

	public String getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(String wishlistId) {
		this.wishlistId = wishlistId;
	}

	public List<ProductBean> getProductId() {
		return product;
	}

	public void setProductId(List<ProductBean> productId) {
		this.product = productId;
	}

	public WishlistBean(String wishlistId, List<ProductBean> productId) {
		super();
		this.wishlistId = wishlistId;
		this.product = productId;
	}
	public WishlistBean() {
		
	}
	
}