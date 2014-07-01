package dorg.dao.impl;

import org.springframework.stereotype.Repository;

import dorg.dao.AbstractHibernateDAO;
import dorg.dao.ICategoryDao;
import dorg.model.Category;

@Repository
public class CategoryDao extends AbstractHibernateDAO<Category> implements ICategoryDao {
	  public CategoryDao() {
	        super();

	        setClazz(Category.class);
	    }

}
