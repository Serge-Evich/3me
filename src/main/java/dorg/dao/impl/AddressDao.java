package dorg.dao.impl;

import org.springframework.stereotype.Repository;

import dorg.dao.AbstractHibernateDAO;
import dorg.dao.IAddressDao;
import dorg.model.Address;

@Repository
public class AddressDao extends AbstractHibernateDAO<Address> implements IAddressDao {
	  public AddressDao() {
	        super();

	        setClazz(Address.class);
	    }

}