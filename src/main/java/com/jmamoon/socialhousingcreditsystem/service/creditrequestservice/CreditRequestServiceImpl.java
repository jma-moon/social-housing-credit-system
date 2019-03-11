/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.creditrequestservice;

import com.jmamoon.socialhousingcreditsystem.entity.CreditRequest;
import com.jmamoon.socialhousingcreditsystem.repository.creditrequestdao.CreditRequestDao;
import com.jmamoon.socialhousingcreditsystem.repository.persondao.PersonDao;
import com.jmamoon.socialhousingcreditsystem.repository.propertydao.PropertyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class CreditRequestServiceImpl implements CreditRequestService {

    @Autowired
    private CreditRequestDao creditRequestDao;

    @Autowired
    private PersonDao personDao;
    
    @Autowired
    private PropertyDao propertyDao;
    
    @Override
    public CreditRequest findById(Long id) {
        return creditRequestDao.findById(id).orElse(null);
    }

    @Override
    public CreditRequest save(CreditRequest creditRequest) {
        
        // creditRequest.setPerson(personDao.save(creditRequest.getPerson()));
        // creditRequest.setProperty(propertyDao.save(creditRequest.getProperty()));
        
        return creditRequestDao.save(creditRequest);
    }

}
