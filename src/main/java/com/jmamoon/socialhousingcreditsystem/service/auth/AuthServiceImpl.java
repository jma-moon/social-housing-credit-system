/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.auth;

import com.jmamoon.socialhousingcreditsystem.config.errorhandling.exceptions.NotFoundException;
import com.jmamoon.socialhousingcreditsystem.entity.Person;
import com.jmamoon.socialhousingcreditsystem.repository.persondao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class AuthServiceImpl implements AuthService {
    
    @Autowired
    private PersonDao personDao;

    @Override
    public Person signIn(String personalId, String password) {
        return personDao.findByPersonalIdAndPassword(personalId, password).orElseThrow(() -> {
            return new NotFoundException();
        });
    }
    
}
