/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.creditrequestservice;

import com.jmamoon.socialhousingcreditsystem.entity.CreditRequest;
import java.util.List;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface CreditRequestService {

    public List<CreditRequest> findAll();

    public CreditRequest findById(Long id);

    public CreditRequest save(CreditRequest creditRequest);

}
