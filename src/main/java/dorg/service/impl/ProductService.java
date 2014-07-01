package dorg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import dorg.dao.IOperations;
import dorg.dao.IProductDao;
import dorg.model.Product;
import dorg.service.AbstractService;
import dorg.service.IProductService;

public class ProductService extends AbstractService<Product> implements IProductService {

    @Autowired
    private IProductDao dao;

    public ProductService() {
        super();
    }

    // API

   @Override
    protected IOperations<Product> getDao() {
        return dao;
    }
}