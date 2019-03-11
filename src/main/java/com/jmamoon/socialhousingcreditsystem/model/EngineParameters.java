/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class EngineParameters {

    private Map<String, Double> parameters;

    public EngineParameters() {
        this.parameters = new HashMap<>();
    }

    public Double getParameter(String key) {
        return parameters.get(key);
    }

    public void setParameter(String key, Double value) {
        this.parameters.put(key, value);
    }

}
