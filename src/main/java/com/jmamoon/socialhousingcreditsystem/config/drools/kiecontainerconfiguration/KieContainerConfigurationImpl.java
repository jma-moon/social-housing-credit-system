/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.drools.kiecontainerconfiguration;

import com.jmamoon.socialhousingcreditsystem.config.drools.kiefilesystemconfiguration.KieFileSystemConfiguration;
import com.jmamoon.socialhousingcreditsystem.config.drools.KieServiceFactory.KieServicesFactory;
import java.io.IOException;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieRepository;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Configuration
public class KieContainerConfigurationImpl implements KieContainerConfiguration {

    @Autowired
    private KieFileSystemConfiguration kfsc;

    @Bean
    @ConditionalOnMissingBean(KieContainer.class)
    @Override
    public KieContainer kieContainer() throws IOException {

        final KieRepository kieRepository = KieServicesFactory.create()
                .getRepository();

        kieRepository.addKieModule(() -> kieRepository.getDefaultReleaseId());

        KieBuilder kieBuilder = KieServicesFactory.create()
                .newKieBuilder(this.kfsc.kieFileSystem());
        kieBuilder.buildAll();

        KieContainer kieContainer = KieServicesFactory.create()
                .newKieContainer(kieRepository.getDefaultReleaseId());

        return kieContainer;
    }

}
