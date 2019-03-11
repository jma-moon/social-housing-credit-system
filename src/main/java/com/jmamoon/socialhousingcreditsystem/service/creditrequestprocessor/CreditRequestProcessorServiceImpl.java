/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.creditrequestprocessor;

import com.jmamoon.socialhousingcreditsystem.entity.CreditRequest;
import com.jmamoon.socialhousingcreditsystem.model.EngineParameters;
import com.jmamoon.socialhousingcreditsystem.repository.creditrequestprocessor.CreditRequestProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class CreditRequestProcessorServiceImpl implements CreditRequestProcessorService {

    @Autowired
    private CreditRequestProcessor creditRequestProcessor;

    @Override
    public CreditRequest processCreditRequest(CreditRequest creditRequest, EngineParameters engineParameters) {
        return this.creditRequestProcessor.processCreditRequest(creditRequest, engineParameters);
    }

}
