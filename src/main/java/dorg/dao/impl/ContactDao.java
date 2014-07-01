package dorg.dao.impl;

import org.springframework.stereotype.Repository;

import dorg.dao.AbstractHibernateDAO;
import dorg.dao.IContactDao;
import dorg.model.*;

@Repository
public class ContactDao extends AbstractHibernateDAO<Contact> implements IContactDao {
	  public ContactDao() {
	        super();

	        setClazz(Contact.class);
	    }

}
