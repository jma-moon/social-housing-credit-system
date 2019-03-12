/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.controller;

import com.jmamoon.socialhousingcreditsystem.entity.Person;
import com.jmamoon.socialhousingcreditsystem.service.auth.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/sign-in")
    public Person signIn(@RequestBody Person person) {

        String personalId = person.getPersonalId();
        String password = person.getPassword();

        return this.authService.signIn(personalId, password);
    }

}
