package dorg.dao.impl;

import org.springframework.stereotype.Repository;

import dorg.dao.AbstractHibernateDAO;
import dorg.dao.IProductDao;
import dorg.model.Product;

@Repository
public class ProductDao extends AbstractHibernateDAO<Product> implements IProductDao {
	  public ProductDao() {
	        super();

	        setClazz(Product.class);
	    }

}
