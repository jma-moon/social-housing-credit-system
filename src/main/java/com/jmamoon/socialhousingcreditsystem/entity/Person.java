/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 8, max = 32)
    @Column(name = "personal_id")
    private String personalId;

    @NotNull
    @Size(min = 8, max = 32)
    @Column(name = "passwd")
    @JsonProperty(access = Access.WRITE_ONLY)
    private String password;

    @NotNull
    @Column(name = "full_name")
    private String fullName;

    @NotNull
    @Min(0)
    @Column(name = "age")
    private Integer age;

    @NotNull
    @Min(0)
    @Column(name = "amount_per_month")
    private Double amountPerMonth;

    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<CreditRequest> creditRequests;

    public Person() {
        this.creditRequests = new ArrayList<>();
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String FullName) {
        this.fullName = FullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getAmountPerMonth() {
        return amountPerMonth;
    }

    public void setAmountPerMonth(Double amountPerMonth) {
        this.amountPerMonth = amountPerMonth;
    }

    public List<CreditRequest> getCreditRequests() {
        return creditRequests;
    }

    public void setCreditRequests(List<CreditRequest> creditRequests) {
        this.creditRequests = creditRequests;
    }

    private static final Long serialVersionUID = 1L;

}
