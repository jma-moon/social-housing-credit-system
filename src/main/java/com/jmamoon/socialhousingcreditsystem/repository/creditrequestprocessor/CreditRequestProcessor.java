/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.repository.creditrequestprocessor;

import com.jmamoon.socialhousingcreditsystem.model.CreditRequest;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface CreditRequestProcessor {

    public CreditRequest processCreditRequest(CreditRequest creditRequest);

}