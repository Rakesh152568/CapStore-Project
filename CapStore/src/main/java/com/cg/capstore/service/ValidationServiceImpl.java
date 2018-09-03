package com.cg.capstore.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cg.capstore.bean.CustomerBean;
import com.cg.capstore.bean.MerchantBean;
import com.cg.capstore.exception.ValidationException;
import com.cg.capstore.repo.CustomerRepo;
import com.cg.capstore.repo.MerchantRepo;

@Service
@Transactional
public class ValidationServiceImpl implements IValidationService {

	@Autowired
	private CustomerRepo repo1;

	@Autowired
	private MerchantRepo repo2;

	@Autowired
	@PersistenceContext
	EntityManager entity;

	private JavaMailSender javaMailSender;

	@Autowired
	public ValidationServiceImpl(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	static Optional<CustomerBean> list1;
	static Optional<MerchantBean> list2;

	@Override
	public String findMerchant(String emailId) throws ValidationException {
		String senderEmail = emailId;
		/*String res="";
		System.err.println(senderEmail);
		//List<MerchantBean> merchants = repo2.findAll();
		List<MerchantBean> merchants = repo2.getAllMerchants();
		
		System.err.println(merchants);
						
		System.err.println(merchants.contains(emailId));*/
		//MerchantBean merchants = repo2.findOne(emailId);
		MerchantBean merchants = repo2.getOne(emailId);
		String rak=merchants.getEmailId();
		System.err.println(rak);
		System.err.println(senderEmail);
		if (rak.equals(senderEmail)) {
			
			
			
			
			try {
				/*list2 = repo2.findById(senderEmail);
				System.err.println(list2);*/
				String message="";
				//message = sendMail(emailId);
				message = "Mail Sent to "+emailId+" Successfully...";
				
				//res = "Success";
				return message;
			} catch (Exception e) {
				throw new  ValidationException("Merchant Mail is not valid" + e);

			}
		}
		else {
		return "Error in sending mail...";
		}
	}
	
	
	private String sendMail(String merchantEmail) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(merchantEmail);
		System.err.println(merchantEmail);
		mail.setFrom("udykmr13@gmail.com");
		mail.setSubject("Verification");
		mail.setText(" The Merchant Mail is Verified"); // get the v_code from the table and give it here
		javaMailSender.send(mail);
		return "Mail Sent to "+merchantEmail+" Successfully...";
	}
	

	@Override
	public String findCustomer(String email) throws ValidationException {
		String senderEmail = email;
		String des="";
		List<CustomerBean> customers= repo1.findAll();
		
		if(customers.contains(email)) {

		try {
			list1 = repo1.findById(senderEmail);

			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setTo(senderEmail);
			mail.setFrom("udykmr13@gmail.com");
			mail.setSubject("Verification");
			mail.setText(" The Customer Mail is Verified"); // get the v_code from the table and give it here
			javaMailSender.send(mail);
			return "success";

		} catch (Exception e) {
			throw new ValidationException( "Customer Mail is not valid" + e);

		}
		}
		return des;

	}

}
