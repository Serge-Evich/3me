package dorg.dao.impl;

import org.springframework.stereotype.Repository;

import dorg.dao.AbstractHibernateDAO;
import dorg.dao.IUserDao;
import dorg.model.User;

@Repository
public class UserDao extends AbstractHibernateDAO<User> implements IUserDao {
	  public UserDao() {
	        super();

	        setClazz(User.class);
	    }

}
