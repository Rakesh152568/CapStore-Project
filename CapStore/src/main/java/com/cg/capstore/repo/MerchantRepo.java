package com.cg.capstore.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.capstore.bean.MerchantBean;

@Repository
public interface MerchantRepo extends JpaRepository<MerchantBean, String>{
	
	@Query(value="SELECT emailId FROM MerchantBean m")
	public List<MerchantBean> getAllMerchants();

}
