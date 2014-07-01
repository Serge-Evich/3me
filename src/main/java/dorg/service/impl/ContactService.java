package dorg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dorg.dao.IContactDao;
import dorg.dao.IOperations;
import dorg.model.Contact;
import dorg.service.AbstractService;
import dorg.service.IContactService;

@Service
public class ContactService extends AbstractService<Contact> implements IContactService {

    @Autowired
    private IContactDao dao;

    public ContactService() {
        super();
    }

    // API

   @Override
    protected IOperations<Contact> getDao() {
        return dao;
    }



}