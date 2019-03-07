/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.kmodulebeanfactorypostprocessorconfiguration;

import org.kie.spring.KModuleBeanFactoryPostProcessor;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface KModuleBeanFactoryPostProcessorConfiguration {
    
    public KModuleBeanFactoryPostProcessor kiePostProcessor();
    
}
