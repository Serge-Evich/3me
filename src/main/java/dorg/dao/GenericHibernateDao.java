package dorg.dao;

import java.io.Serializable;

public class GenericHibernateDao<T extends Serializable> extends AbstractHibernateDAO<T> implements IGenericDao<T> {

}
