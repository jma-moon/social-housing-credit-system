/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.drools.kiebaseconfiguration;

import java.io.IOException;
import org.kie.api.KieBase;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface KieBaseConfiguration {

    public KieBase getKieBase() throws IOException;

}
