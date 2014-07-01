package dorg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dorg.dao.IOrdersDao;
import dorg.dao.IOperations;
import dorg.model.Orders;
import dorg.service.AbstractService;
import dorg.service.IOrdersService;

@Service
public class OrdersService extends AbstractService<Orders> implements IOrdersService {

    @Autowired
    private IOrdersDao dao;

    public OrdersService() {
        super();
    }

    // API

   @Override
    protected IOperations<Orders> getDao() {
        return dao;
    }
}