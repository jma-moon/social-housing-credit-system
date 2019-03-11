/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.creditrequestservice;

import com.jmamoon.socialhousingcreditsystem.entity.CreditRequest;
import com.jmamoon.socialhousingcreditsystem.repository.creditrequestdao.CreditRequestDao;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class CreditRequestServiceImpl implements CreditRequestService {

    @Autowired
    private CreditRequestDao creditRequestDao;

    @Autowired
    private MessageSource messageSource;

    @Override
    public CreditRequest findById(Long id) {
        CreditRequest creditRequest = creditRequestDao.findById(id).orElse(null);
        
        if (creditRequest != null) {
            mapIssueCodes(creditRequest);
        }
        
        return creditRequest;
    }

    @Override
    public CreditRequest save(CreditRequest creditRequest) {


        CreditRequest savedCreditRequest = creditRequestDao.save(creditRequest);
        mapIssueCodes(savedCreditRequest);

        return savedCreditRequest;
    }

    private void mapIssueCodes(CreditRequest creditRequest) {
        creditRequest.getIssues().stream()
                .map((issue) -> {
                    issue.setCode(messageSource.getMessage(issue.getCode(), null, LocaleContextHolder.getLocale()));
                    return issue;
                })
                .collect(Collectors.toList());
    }

}
