package dorg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dorg.dao.IOperations;
import dorg.dao.ICustomerDao;
import dorg.model.Customer;
import dorg.service.AbstractService;
import dorg.service.ICustomerService;

@Service
public class CustomerService extends AbstractService<Customer> implements ICustomerService {

    @Autowired
    private ICustomerDao dao;

    public CustomerService() {
        super();
    }

    // API

   @Override
    protected IOperations<Customer> getDao() {
        return dao;
    }



}
