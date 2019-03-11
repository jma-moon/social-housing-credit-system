/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.controller;

import com.jmamoon.socialhousingcreditsystem.entity.EngineParameter;
import com.jmamoon.socialhousingcreditsystem.service.engineparameterservice.EngineParameterService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@RestController
@RequestMapping("/engine-parameters")
public class EngineParameterController {
    
    @Autowired
    private EngineParameterService engineParameterService;
    
    @GetMapping
    public List<EngineParameter> index() {
        return engineParameterService.findAll();
    }
    
}
