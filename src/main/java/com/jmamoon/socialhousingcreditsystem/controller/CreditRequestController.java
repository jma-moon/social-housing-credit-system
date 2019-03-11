/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.controller;

import com.jmamoon.socialhousingcreditsystem.entity.CreditRequest;
import com.jmamoon.socialhousingcreditsystem.model.EngineParameters;
import com.jmamoon.socialhousingcreditsystem.repository.creditrequestprocessor.CreditRequestProcessor;
import com.jmamoon.socialhousingcreditsystem.service.creditrequestservice.CreditRequestService;
import com.jmamoon.socialhousingcreditsystem.service.engineparametersservice.EngineParametersService;
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
@RestController
@RequestMapping("/credit-request")
public class CreditRequestController {

    @Autowired
    private CreditRequestProcessor creditRequestProcessor;

    @Autowired
    private CreditRequestService creditRequestService;

    @Autowired
    private EngineParametersService engineParametersService;

    @PostMapping
    public CreditRequest save(@RequestBody CreditRequest creditrequest) {

        EngineParameters engineParameters = engineParametersService.getEngineParameters();

        CreditRequest processCreditRequest = creditRequestProcessor.processCreditRequest(creditrequest, engineParameters);
        processCreditRequest = creditRequestService.save(processCreditRequest);

        return processCreditRequest;
    }

}
