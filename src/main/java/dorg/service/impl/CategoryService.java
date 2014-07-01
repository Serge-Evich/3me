package dorg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import dorg.dao.IOperations;
import dorg.dao.ICategoryDao;
import dorg.model.Category;
import dorg.service.AbstractService;
import dorg.service.ICategoryService;

public class CategoryService extends AbstractService<Category> implements ICategoryService {

    @Autowired
    private ICategoryDao dao;

    public CategoryService() {
        super();
    }

    // API

   @Override
    protected IOperations<Category> getDao() {
        return dao;
    }
}