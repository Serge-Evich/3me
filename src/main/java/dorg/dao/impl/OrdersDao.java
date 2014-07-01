package dorg.dao.impl;

import org.springframework.stereotype.Repository;

import dorg.dao.AbstractHibernateDAO;
import dorg.dao.IOrdersDao;
import dorg.model.Orders;

@Repository
public class OrdersDao extends AbstractHibernateDAO<Orders> implements IOrdersDao {
	  public OrdersDao() {
	        super();

	        setClazz(Orders.class);
	    }

}