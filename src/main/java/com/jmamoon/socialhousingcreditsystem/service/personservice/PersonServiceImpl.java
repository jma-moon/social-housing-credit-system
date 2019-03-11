/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.personservice;

import com.jmamoon.socialhousingcreditsystem.entity.Person;
import com.jmamoon.socialhousingcreditsystem.repository.persondao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person findById(Long id) {
        return personDao.findById(id).orElse(null);
    }

    @Override
    public Person save(Person person) {
        return personDao.save(person);
    }

}
