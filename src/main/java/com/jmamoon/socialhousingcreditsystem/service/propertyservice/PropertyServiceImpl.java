/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.propertyservice;

import com.jmamoon.socialhousingcreditsystem.entity.Property;
import com.jmamoon.socialhousingcreditsystem.repository.propertydao.PropertyDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyDao propertyDao;

    @Override
    public List<Property> findAll() {
        return propertyDao.findAll();
    }

    @Override
    public Property findById(Long id) {
        return propertyDao.findById(id).orElse(null);
    }

    @Override
    public Property save(Property property) {
        return propertyDao.save(property);
    }

}
