/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.drools.rulesresolver;

import java.io.IOException;
import java.util.List;
import org.springframework.core.io.Resource;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface RulesResolver {

    public List<Resource> getRuleFiles()throws IOException;

}
