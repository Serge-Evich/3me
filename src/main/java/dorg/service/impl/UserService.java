package dorg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dorg.dao.IOperations;
import dorg.dao.IUserDao;
import dorg.model.User;
import dorg.service.AbstractService;
import dorg.service.IUserService;

@Service
public class UserService extends AbstractService<User> implements IUserService {

    @Autowired
    private IUserDao dao;

    public UserService() {
        super();
    }

    // API

   @Override
    protected IOperations<User> getDao() {
        return dao;
    }



}
