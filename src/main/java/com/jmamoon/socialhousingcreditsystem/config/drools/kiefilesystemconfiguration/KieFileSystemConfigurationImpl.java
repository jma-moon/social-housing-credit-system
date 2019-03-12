/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.drools.kiefilesystemconfiguration;

import com.jmamoon.socialhousingcreditsystem.config.drools.KieServiceFactory.KieServicesFactory;
import com.jmamoon.socialhousingcreditsystem.config.drools.rulesresolver.RulesResolver;
import com.jmamoon.socialhousingcreditsystem.constants.Constants;
import java.io.IOException;
import java.util.List;
import org.kie.api.builder.KieFileSystem;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Configuration
public class KieFileSystemConfigurationImpl implements KieFileSystemConfiguration {

    @Autowired
    private RulesResolver rulesResolver;

    @Bean
    @ConditionalOnMissingBean(KieFileSystem.class)
    @Override
    public KieFileSystem kieFileSystem() throws IOException {

        KieFileSystem kieFileSystem = KieServicesFactory.create().newKieFileSystem();
        this.setKieFileSystemRules(kieFileSystem);
        
        return kieFileSystem;
    }

    private void setKieFileSystemRules(KieFileSystem kieFileSystem) throws IOException {

        List<Resource> ruleFiles = this.rulesResolver.getRuleFiles();

        ruleFiles.stream().forEach((file) -> {
            kieFileSystem.write(ResourceFactory.newClassPathResource(Constants.RULES_PATH + file.getFilename(), "UTF-8"));
        });
    }

}
