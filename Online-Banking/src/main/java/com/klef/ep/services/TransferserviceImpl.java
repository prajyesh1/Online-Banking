package com.klef.ep.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Deposit;
import com.klef.ep.models.Transfer;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class TransferserviceImpl  implements TransferService
{


	@Override
	public String addTransfer(Transfer emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
	   	  EntityManager em = emf.createEntityManager();
	   	  
	   	  em.getTransaction().begin();
	   	  em.persist(emp);     // insert operation
	   	  em.getTransaction().commit();
	   	  
	   	  em.close();
	   	  emf.close();
	   	  
	   	  return "Record Inserted Successfully";
	}

	

	
	




}
