/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.model;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class Person {

    private String name;
    private int age;
    private double affordablePaymentPerMonth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAffordablePaymentPerMonth() {
        return affordablePaymentPerMonth;
    }

    public void setAffordablePaymentPerMonth(double affordablePayment) {
        this.affordablePaymentPerMonth = affordablePayment;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
