/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.auth;

import com.jmamoon.socialhousingcreditsystem.entity.Person;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface AuthService {

    public Person signIn(String personalId, String password);

}
