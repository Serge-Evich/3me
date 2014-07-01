package dorg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dorg.dao.IAddressDao;
import dorg.dao.IOperations;
import dorg.model.Address;
import dorg.service.AbstractService;
import dorg.service.IAddressService;

@Service
public class AddressService extends AbstractService<Address> implements IAddressService {

    @Autowired
    private IAddressDao dao;

    public AddressService() {
        super();
    }

    // API

   @Override
    protected IOperations<Address> getDao() {
        return dao;
    }



}