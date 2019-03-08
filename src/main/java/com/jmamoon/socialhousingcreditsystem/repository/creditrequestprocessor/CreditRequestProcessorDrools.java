/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.repository.creditrequestprocessor;

import com.jmamoon.socialhousingcreditsystem.model.CreditRequest;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Repository
public class CreditRequestProcessorDrools implements CreditRequestProcessor {

    @Autowired
    private KieContainer kieContainer;

    @Override
    public CreditRequest processCreditRequest(CreditRequest creditRequest) {

        KieSession kieSession = kieContainer.newKieSession();

        kieSession.insert(creditRequest);
        kieSession.fireAllRules();
        kieSession.destroy();

        return creditRequest;
    }

}
