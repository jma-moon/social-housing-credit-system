/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.service.issueservice;

import com.jmamoon.socialhousingcreditsystem.entity.Issue;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface IssueService {

    public Issue findById(Long id);

    public Issue save(Issue issue);

}
