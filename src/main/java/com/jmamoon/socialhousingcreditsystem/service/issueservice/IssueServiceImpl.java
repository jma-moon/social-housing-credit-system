/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.issueservice;

import com.jmamoon.socialhousingcreditsystem.entity.Issue;
import com.jmamoon.socialhousingcreditsystem.repository.issuedao.IssueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    private IssueDao issueDao;

    @Override
    public Issue findById(Long id) {
        return issueDao.findById(id).orElse(null);
    }

    @Override
    public Issue save(Issue issue) {
        return issueDao.save(issue);
    }

}
