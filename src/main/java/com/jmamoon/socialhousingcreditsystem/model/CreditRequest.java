/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class CreditRequest {

    private Person person;
    private Property property;
    private List<String> issues;

    public CreditRequest() {
        this.issues = new ArrayList<>();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public boolean isAccepted() {
        return this.issues.isEmpty();
    }

    public List<String> getIssues() {
        return this.issues;
    }
    
    public void addIssue(String issue) {
        this.issues.add(issue);
    }

}
