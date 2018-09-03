package com.cg.capstore.bean;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FeedbackCommon")
public class FeedbackCommonBean {
	@Id
	@Column(name="Feedback_common_id")
	private String id;
	
	@ManyToOne
	@JoinColumn(name="merchant_id")
	//private  List<MerchantBean> merchant;
	private MerchantBean merchant;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	//private  List<CustomerBean> customer;
	private CustomerBean customer;
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="date")
	private Date date;
	
	
	public FeedbackCommonBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FeedbackCommonBean(String id,  /*List<CustomerBean>*/ CustomerBean customer, String comments, Date date,  /*List<MerchantBean>*/MerchantBean merchant) {
		super();
		this.id = id;
		this.customer = customer;
		this.comments = comments;
		this.date = date;
		this.merchant = merchant;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/*public List<CustomerBean> getCustomer() {
		return customer;
	}
	public void setCustomer(List<CustomerBean> customer) {
		this.customer = customer;
	}*/
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	/*public List<MerchantBean> getMerchant() {
		return merchant;
	}
	public void setMerchant(List<MerchantBean> merchant) {
		this.merchant = merchant;
	}	*/
	@Override
	public String toString() {
		return "FeedbackCommon [id=" + id + ", merchant=" + merchant + ", customer=" + customer+ ", comments="
				+ comments + ", date=" + date + "]";
	}

	public MerchantBean getMerchant() {
		return merchant;
	}

	public void setMerchant(MerchantBean merchant) {
		this.merchant = merchant;
	}

	public CustomerBean getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}	
	
	

}