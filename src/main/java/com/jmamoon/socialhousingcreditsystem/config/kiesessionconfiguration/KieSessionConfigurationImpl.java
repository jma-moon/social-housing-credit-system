/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.kiesessionconfiguration;

import com.jmamoon.socialhousingcreditsystem.config.kiecontainerconfiguration.KieContainerConfiguration;
import java.io.IOException;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Configuration
public class KieSessionConfigurationImpl implements KieSessionConfiguration {

    @Autowired
    private KieContainerConfiguration kieContainerConfiguration;

    @Bean
    @ConditionalOnMissingBean(KieSession.class)
    @Override
    public KieSession kieSession() throws IOException {
        return this.kieContainerConfiguration.kieContainer().newKieSession();
    }

}
