package dorg.dao.impl;

import org.springframework.stereotype.Repository;

import dorg.dao.AbstractHibernateDAO;
import dorg.dao.ICustomerDao;
import dorg.model.*;
@Repository
public class CustomerDao extends AbstractHibernateDAO<Customer> implements ICustomerDao {
	  public CustomerDao() {
	        super();

	        setClazz(Customer.class);
	    }

}
