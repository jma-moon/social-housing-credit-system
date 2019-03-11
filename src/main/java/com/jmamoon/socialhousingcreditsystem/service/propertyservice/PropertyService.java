/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.propertyservice;

import com.jmamoon.socialhousingcreditsystem.entity.Property;
import java.util.List;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface PropertyService {

    public List<Property> findAll();
    
    public Property findById(Long id);

    public Property save(Property property);

}
