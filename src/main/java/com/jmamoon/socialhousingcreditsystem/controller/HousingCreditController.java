/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.controller;

import com.jmamoon.socialhousingcreditsystem.model.CreditRequest;
import com.jmamoon.socialhousingcreditsystem.service.creditrequestprocessor.CreditRequestProcessorService;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/housing-credit") // context path
public class HousingCreditController {

    @Autowired
    private CreditRequestProcessorService creditRequestProcessorService;

    @PostMapping()
    public CreditRequest calculate(@RequestBody CreditRequest creditRequest) {
        return this.creditRequestProcessorService.processCreditRequest(creditRequest);
    }

}
