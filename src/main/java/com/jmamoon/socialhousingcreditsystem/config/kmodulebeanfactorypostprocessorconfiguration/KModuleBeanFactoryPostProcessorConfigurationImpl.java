/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.kmodulebeanfactorypostprocessorconfiguration;

import com.jmamoon.socialhousingcreditsystem.config.kiecontainerconfiguration.KieContainerConfiguration;
import com.jmamoon.socialhousingcreditsystem.config.kiecontainerconfiguration.KieContainerConfigurationFactory;
import java.io.IOException;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.kie.spring.KModuleBeanFactoryPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Configuration
public class KModuleBeanFactoryPostProcessorConfigurationImpl implements KModuleBeanFactoryPostProcessorConfiguration {

    @Bean
    @ConditionalOnMissingBean(KModuleBeanFactoryPostProcessor.class)
    @Override
    public KModuleBeanFactoryPostProcessor kiePostProcessor() {
        return new KModuleBeanFactoryPostProcessor();
    }

}
