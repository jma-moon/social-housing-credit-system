/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.repository.persondao;

import com.jmamoon.socialhousingcreditsystem.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface PersonDao extends JpaRepository<Person, Long> {

}
