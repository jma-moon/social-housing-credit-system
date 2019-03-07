/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.rulesresolver;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class RulesResolverImpl implements RulesResolver {

    @Value("${jmamoon.drools.rules-path}")
    private String rulesPath;

    @Override
    public List<Resource> getRuleFiles() throws IOException {

        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        
        final Resource[] resources = resourcePatternResolver.getResources("classpath*:" + rulesPath + "**/*.*");

        return Arrays.asList(resources);
    }
}
