/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.rulesresolver;

import com.jmamoon.socialhousingcreditsystem.constants.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Configuration
public class RulesResolverImpl implements RulesResolver {

    @Bean
    @Override
    public List<Resource> getRuleFiles() throws IOException {

        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        
        final Resource[] resources = resourcePatternResolver.getResources("classpath*:" + Constants.RULES_PATH + "**/*.*");

        return Arrays.asList(resources);
    }
}
