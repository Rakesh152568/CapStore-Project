package com.cg.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.capstore.bean.CustomerBean;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerBean, String>{

}
